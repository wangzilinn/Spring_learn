package com.wangzilin.site.service.impl;

import com.wangzilin.site.service.CustomizeService1;
import com.wangzilin.site.service.CustomizeService2;
import com.wangzilin.site.service.CustomizeService3;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 10:53 AM
 */
public class CustomizeServiceImpl3 implements CustomizeService3 {

    public CustomizeServiceImpl3() {
        System.out.println("construct : " + this.getClass().getSimpleName());
    }
    @Override
    public void execute() {
        System.out.println("execute : " + this.getClass().getSimpleName());
    }
}
