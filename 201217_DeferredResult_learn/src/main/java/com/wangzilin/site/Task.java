package com.wangzilin.site;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/17/2020 4:38 PM
 */
@Slf4j
public class Task implements Runnable {
    @Getter
    private final int id;
    @Getter
    private final String operation;
    @Getter
    private List<Response> responseList;
    private Callback callback;
    @Setter
    @Getter
    private Future<?> selfHandler;

    public Task(int id, String operation, Response response, Callback callback) {
        this.id = id;
        this.operation = operation;
        ArrayList<Response> responses = new ArrayList<>();
        responses.add(response);
        this.responseList = responses;

        this.callback = callback;
    }
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
            log.info("请求用户个数" + responseList.size());
            responseList.forEach(response -> {
                String resultString = "userId" + response.getUserId() + "operation:" + operation;
                response.getDeferredResult().setResult(new Response.Result("返回给前端" + resultString));
            });
        } catch (InterruptedException e) {
            responseList.forEach(response -> {
                String resultString = "userId" + response.getUserId();
                response.getDeferredResult().setResult(new Response.Result("返回给前端:命令被其他命令打断" +  resultString) );
            });
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            responseList.clear();
            callback.callback();
        }
    }

}
interface Callback {
    void callback();
}