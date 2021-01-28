package com.wangzilin.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 3:37 PM
 */
@Controller
public class SSEController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "/event", produces = "text/event-stream;charset=UTF-8")
    public String pushEvent() throws InterruptedException {
        System.out.println(new Date());
        return "event:alarm\ndata: this is data\n\n";
    }
}
