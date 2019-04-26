package com.simon.cloud.leaf.api.framework.filter;

import com.simon.cloud.leaf.api.framework.kits.JsonUtil;
import com.simon.cloud.leaf.api.framework.kits.JwtHelper;
import com.simon.cloud.leaf.api.framework.kits.LeafConstant;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;

@Slf4j
public class SecurityFilter implements Filter {


    private String[] excludedUris;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludedUris = filterConfig.getInitParameter("excludedUri").split(",");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        String uri = httpServletRequest.getServletPath();
        log.info("This is SecurityFilter, uri:{}", uri);
        if(!isExcludedUri(uri)){
            //获取请求中header参数
            Claims claims = JwtHelper.parseJWT(httpServletRequest.getHeader(LeafConstant.HTTP_TOKEN));

            httpServletRequest.getSession().setAttribute(LeafConstant.SESSION_USER,
                    JsonUtil.toString(claims.get(LeafConstant.SESSION_USER, LinkedHashMap.class)));
        }
        chain.doFilter(httpServletRequest, httpServletResponse);

    }

    @Override
    public void destroy() {

    }


    private boolean isExcludedUri(String uri) {
        if (excludedUris == null || excludedUris.length <= 0) {
            return false;
        }
        for (String ex : excludedUris) {
            uri = uri.trim();
            ex = ex.trim();
            if (uri.toLowerCase().matches(ex.toLowerCase().replace("*",".*")))
                return true;
        }
        return false;
    }


}
