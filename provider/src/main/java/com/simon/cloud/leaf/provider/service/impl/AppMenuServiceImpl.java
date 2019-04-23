package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.entity.AppMenuExample;
import com.simon.cloud.leaf.api.enums.status.MenuStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppMenuMapper;
import com.simon.cloud.leaf.provider.service.AppMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppMenuServiceImpl implements AppMenuService {

    @Autowired
    AppMenuMapper appMenuMapper;

    @Override
    public ReturnValue add(AppMenu record) throws BusinessException {
        record.setStoreId(1L);
        record.setMenuStatus(MenuStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appMenuMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppMenu record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appMenuMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppMenu record = new AppMenu();
        record.setId(id);
        record.setMenuStatus(MenuStatus.UNAVAILABLE.getValue());
        return ReturnValue.success().setData(appMenuMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppMenuExample example = new AppMenuExample();
        AppMenuExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andMenuStatusEqualTo(MenuStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appMenuMapper.selectByExample(example));
    }
}
