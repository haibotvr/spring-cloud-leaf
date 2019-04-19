package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AdminUser;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.vo.UserLoginVO;
import com.simon.cloud.leaf.provider.service.AdminUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping(value = "/adminUser/login")
    public ReturnValue login(@RequestBody UserLoginVO vo) {
        return adminUserService.login(vo);
    }

    @PostMapping(value = "/adminUser/insert")
    public ReturnValue insert(@RequestBody AdminUser record) {
        return adminUserService.insert(record);
    }

}
