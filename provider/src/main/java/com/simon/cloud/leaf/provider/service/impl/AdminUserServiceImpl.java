package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AdminUser;
import com.simon.cloud.leaf.api.framework.annotation.BeanValid;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.vo.UserLoginVO;
import com.simon.cloud.leaf.provider.dao.AdminUserMapper;
import com.simon.cloud.leaf.provider.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    AdminUserMapper adminUserMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    @BeanValid
    public ReturnValue login(UserLoginVO vo) {
        AdminUser adminUser = adminUserMapper.findByUserName(vo.getUsername());
        if(adminUser == null){
            return ReturnValue.error().setMessage("用户名或密码错误");
        }
        //验证密码
        if(!passwordEncoder.matches(vo.getPassword(), adminUser.getLoginPassword())){
            return ReturnValue.error().setMessage("用户名或密码错误");
        }
        return ReturnValue.success().setData(adminUser).setMessage("登录成功");
    }

    @Override
    @BeanValid
    public ReturnValue insert(AdminUser vo) {
        AdminUser adminUser = adminUserMapper.findByUserName(vo.getLoginName());
        if(adminUser != null){
            return ReturnValue.error().setMessage("用户名已存在");
        }
        vo.setLoginPassword(passwordEncoder.encode(vo.getLoginPassword()));
        adminUserMapper.insert(vo);
        return ReturnValue.success().setMessage("新用户创建成功");
    }
}
