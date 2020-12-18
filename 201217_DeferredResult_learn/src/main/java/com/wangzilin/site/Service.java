package com.wangzilin.site;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/17/2020 4:30 PM
 */
@Slf4j
@org.springframework.stereotype.Service
public class Service {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private Map<Integer, Task> taskMap = new ConcurrentHashMap<>();


    public DeferredResult<Response.Result> sendOperation(String operation, int id, int userId) {
        //设置超时时间
        DeferredResult<Response.Result> deferredResult = new DeferredResult<>(30000L);
        deferredResult.onCompletion(() -> {
            log.info("该线程处理结束");
        });
        deferredResult.onTimeout(() -> {
            log.error("线程处理超时");
            deferredResult.setErrorResult("线程处理超时");
        });
        deferredResult.onError(throwable -> {
            log.error("产生异常");
            deferredResult.setErrorResult("产生异常");
        });
        Response response = new Response(userId, deferredResult);
        synchronized (this){
            if (taskMap.containsKey(id)) {
                // 已经存在相同设备的任务， 判断正在执行的任务的类型知否与之前的相同
                Task task = taskMap.get(id);
                // 与之前的相同：
                if (task.getOperation().equals(operation)) {
                    task.getResponseList().add(response);
                }else {
                    // 与之前的命令不同:
                    // 停止正在运行的任务
                    task.getSelfHandler().cancel(true);

                    Task newTask = new Task(id,operation, response, ()-> taskMap.remove(id));
                    taskMap.put(id, newTask);
                    Future<?> submit = executorService.submit(newTask);
                    newTask.setSelfHandler(submit);
                }
            } else {
                // 不存在正在执行的相同设备指令,则创建新的task
                Task task = new Task(id,operation, response, ()-> taskMap.remove(id));
                taskMap.put(id, task);
                Future<?> submit = executorService.submit(task);
                task.setSelfHandler(submit);
            }
        }
        return deferredResult;
    }
}
