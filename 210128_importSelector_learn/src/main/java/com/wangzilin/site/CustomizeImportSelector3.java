package com.wangzilin.site;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 10:55 AM
 */
// @Order(103)
public class CustomizeImportSelector3 implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("selectImports : " + this.getClass().getSimpleName());
        return new String[]{"com.wangzilin.site.service.impl.CustomizeServiceImpl3"};
    }
}
