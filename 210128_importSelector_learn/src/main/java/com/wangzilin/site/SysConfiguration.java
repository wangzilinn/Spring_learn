package com.wangzilin.site;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: wangzilinn@gmail.com
 * @Date: 1/28/2021 11:05 AM
 */
@Configuration
@Import({CustomizeImportSelector2.class, CustomizeImportSelector3.class})
@EnableCustomizeService1
public class SysConfiguration {
}
