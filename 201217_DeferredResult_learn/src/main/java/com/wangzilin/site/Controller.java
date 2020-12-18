package com.wangzilin.site;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/17/2020 4:03 PM
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {
    final private Service service;


    @GetMapping("/do")
    public DeferredResult<Response.Result> operation(@RequestParam("operation") String operation,
                                            @RequestParam("id") int id,
                                            @RequestParam("userId") int userId) {

        return service.sendOperation(operation, id, userId);
    }


}
