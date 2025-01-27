package com.template.common.interceptor;

import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerTimeLoggingInterceptor extends HandlerInterceptorAdapter {
    private static final Logger log = Logger.getLogger(HandlerTimeLoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime",System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        request.setAttribute("endTime",System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Long startTime = (Long)request.getAttribute("startTime");
        Long endTime = (Long)request.getAttribute("endTime");
        log.info(endTime - startTime);
    }
}
