package com.simon.cloud.leaf.consumer.controller;

import com.simon.cloud.leaf.api.entity.AdminUser;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.vo.UserLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/adminUser")
public class AdminUserController {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/login")
    public ReturnValue login(UserLoginVO vo) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/adminUser/login", vo, ReturnValue.class);
    }

    @RequestMapping(value = "/insert")
    public ReturnValue login(AdminUser vo) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/adminUser/insert", vo, ReturnValue.class);
    }

}
