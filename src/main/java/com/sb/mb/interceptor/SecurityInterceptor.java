package com.sb.mb.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-mybatis
 * @package: com.sb.mb.interceptor、
 * @email: cy880708@163.com
 * @date: 2019/2/21 上午10:46
 * @mofified By:
 */
@Component
public class SecurityInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(SecurityInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        System.out.println(" --------- url ----------" + url);
        logger.info("url : " + url);
        return true;
    }
}
