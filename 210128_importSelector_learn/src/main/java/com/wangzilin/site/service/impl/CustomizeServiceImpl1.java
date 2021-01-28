package com.wangzilin.site.service.impl;

import com.wangzilin.site.service.CustomizeService1;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 10:53 AM
 */
public class CustomizeServiceImpl1 implements CustomizeService1 {

    public CustomizeServiceImpl1() {
        System.out.println("construct : " + this.getClass().getSimpleName());
    }
    @Override
    public void execute() {
        System.out.println("execute : " + this.getClass().getSimpleName());
    }
}
