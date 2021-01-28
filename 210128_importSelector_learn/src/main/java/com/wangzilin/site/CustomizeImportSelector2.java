package com.wangzilin.site;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 10:55 AM
 */
@Order(102)
public class CustomizeImportSelector2 implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("selectImports : " + this.getClass().getSimpleName());
        return new String[]{"com.wangzilin.site.service.impl.CustomizeServiceImpl2"};
    }
}
