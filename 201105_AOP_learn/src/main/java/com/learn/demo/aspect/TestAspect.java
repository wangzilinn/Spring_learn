package com.learn.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(* com.learn.demo.dao.*.*(..))")
    public void point() {

    }


    @Before("point()")
    public void beforeAspect() {
        System.out.println("before....");
    }
}
