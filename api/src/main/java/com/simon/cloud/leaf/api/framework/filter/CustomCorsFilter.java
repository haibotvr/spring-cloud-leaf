package com.simon.cloud.leaf.api.framework.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CustomCorsFilter
 * 
 * @author vladimir.stankovic
 *
 * Aug 3, 2016
 */
@Slf4j
public class CustomCorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        //设置过滤器内返回的返回值类型
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");      //为安全起见，可配置允许访问的请求方地址。这里配置成*号，是允许所有访问。
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");        //为安全起见，也可配置成只允许POST请求
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "Content-Type, token");      //这里要注意，token是自定义的请求头当中带的token，在这里必须添加，否则你永远获取不到。
        httpServletResponse.addHeader("Access-Control-Max-Age", "1800");//30 min
        chain.doFilter(httpServletRequest, httpServletResponse);
    }

    @Override
    public void destroy() {

    }

}