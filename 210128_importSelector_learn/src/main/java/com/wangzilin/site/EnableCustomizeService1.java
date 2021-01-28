package com.wangzilin.site;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 11:09 AM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CustomizeImportSelector1.class)
public @interface EnableCustomizeService1 {
    String policy() default "simple";
}
