package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppMenuMapper;
import com.simon.cloud.leaf.provider.service.AppMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppMenuServiceImpl implements AppMenuService {

    @Autowired
    AppMenuMapper appMenuMapper;

    @Override
    public ReturnValue add(AppMenu vo) throws BusinessException {
        return null;
    }

    @Override
    public ReturnValue edit(AppMenu vo) throws BusinessException {
        return null;
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        return null;
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        throw new BusinessException(6001, "手动异常");
        //2.从数据库获取

//        return null;
    }
}
