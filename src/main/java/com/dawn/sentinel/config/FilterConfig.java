package com.dawn.sentinel.config;

import com.alibaba.csp.sentinel.adapter.servlet.CommonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * Created by Dawn on 2020-01-05.
 */
@Configuration
public class FilterConfig {

    public FilterRegistrationBean sentinelFilterRegisteration(){
        FilterRegistrationBean<Filter> registration= new FilterRegistrationBean<>();
        registration.setFilter(new CommonFilter());
        registration.addUrlPatterns("/*");
        registration.setName("sentinelFilter");
        registration.setOrder(1);
        return registration;
    }
}
