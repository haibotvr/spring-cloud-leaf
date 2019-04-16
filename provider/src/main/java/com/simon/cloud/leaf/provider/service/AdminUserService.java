package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AdminUser;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.vo.UserLoginVO;

public interface AdminUserService {

    ReturnValue login(UserLoginVO vo);

    ReturnValue insert(AdminUser vo);
}
