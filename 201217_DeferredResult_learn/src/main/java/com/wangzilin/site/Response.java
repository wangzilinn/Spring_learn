package com.wangzilin.site;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 12/17/2020 4:51 PM
 */
@Data
@AllArgsConstructor
public class Response {
    private int userId;
    private DeferredResult<Result> deferredResult;

    @Data
    @AllArgsConstructor
    public static class Result{
        private String msg;
    }
}
