package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AdminUser;
import com.simon.cloud.leaf.api.enums.exception.BusinessExceptionMessage;
import com.simon.cloud.leaf.api.enums.status.AdminUserStatus;
import com.simon.cloud.leaf.api.framework.annotation.BeanValid;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
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
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getName());
        }
        if(adminUser.getUserStatus().equals(AdminUserStatus.UNAVAILABLE.getValue())){
            throw new BusinessException(BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getValue(), BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getName());
        }
        //验证密码
        if(!passwordEncoder.matches(vo.getPassword(), adminUser.getLoginPassword())){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getName());
        }
        return ReturnValue.success().setData(adminUser).setMessage("登录成功");
    }

    @Override
    @BeanValid
    public ReturnValue insert(AdminUser record) {
        AdminUser adminUser = adminUserMapper.findByUserName(record.getLoginName());
        if(adminUser != null){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_IS_EXIST.getValue(), BusinessExceptionMessage.LOGIN_NAME_IS_EXIST.getName());
        }
        record.setUserStatus(AdminUserStatus.AVAILABLE.getValue());
        record.setLoginPassword(passwordEncoder.encode(record.getLoginPassword()));
        adminUserMapper.insert(record);
        return ReturnValue.success().setMessage("新用户创建成功");
    }
}
