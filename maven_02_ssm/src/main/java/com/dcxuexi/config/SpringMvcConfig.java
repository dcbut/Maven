package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/***
 * @Title config
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/12 17:16
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
