package com.simon.cloud.leaf.api.framework.config;

import com.simon.cloud.leaf.api.framework.filter.CustomCorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

/**
 * @author simon.wei
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    protected BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public FilterRegistrationBean securityFilter(){
//        //配置无需过滤的路径或者静态资源，如：css，image等
//        StringBuffer excludedUriStr = new StringBuffer();
//        excludedUriStr.append("/consumer/adminUser/login");
//        excludedUriStr.append(",");
//        excludedUriStr.append("/adminUser/login");
//        excludedUriStr.append(",");
//        excludedUriStr.append("/favicon.ico");
//        excludedUriStr.append(",");
//        excludedUriStr.append("/js/*");
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new SecurityFilter());
//        registrationBean.setUrlPatterns(Arrays.asList("/*"));
//        registrationBean.addInitParameter("excludedUri", excludedUriStr.toString());
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean corsFilter(){
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(new CustomCorsFilter());
//        registrationBean.setUrlPatterns(Arrays.asList("/*"));
//        return registrationBean;
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .anyRequest()
                .permitAll();

    }

}
