package com.wangzilin.site;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 10:55 AM
 */
@Order(101)
public class CustomizeImportSelector1 implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        AnnotationAttributes attributes = AnnotationAttributes.fromMap(
                importingClassMetadata.getAnnotationAttributes(
                        EnableCustomizeService1.class.getName(), false));
        assert attributes != null;
        String policy = attributes.getString("policy");
        System.out.println(policy);
        System.out.println("selectImports : " + this.getClass().getSimpleName());
        return new String[]{"com.wangzilin.site.service.impl.CustomizeServiceImpl1"};
    }
}
