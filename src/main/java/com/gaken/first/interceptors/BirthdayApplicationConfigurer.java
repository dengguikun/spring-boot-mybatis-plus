package com.gaken.first.interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description: 拦截机配置类
 * @author: dengguikun
 * @date: 2018-12-26
 * @param null
 * @return:
 */
@Configuration
public class BirthdayApplicationConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        /**
         * 1.多个拦截器组成一个拦截器链
         * 2.addPathPatterns 用于添加拦截规则
         * 3.excludePathPatterns 拦截规则
         */
        registry.addInterceptor(new ThiefInterceptor1()).addPathPatterns("/**");
        registry.addInterceptor(new ThiefInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);

    }
}