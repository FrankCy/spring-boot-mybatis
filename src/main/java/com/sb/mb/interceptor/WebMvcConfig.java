package com.sb.mb.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.interceptor、
 * @email: cy880708@163.com
 * @date: 2019/2/21 上午10:48
 * @mofified By:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截器
        System.out.println("WebMvcConfigurer");
        logger.info("WebMvcConfigurer - " );
        registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/**");
    }

}
