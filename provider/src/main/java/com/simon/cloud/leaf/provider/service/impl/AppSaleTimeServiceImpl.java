package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppSaleTime;
import com.simon.cloud.leaf.api.entity.AppSaleTimeExample;
import com.simon.cloud.leaf.api.enums.status.SaleTimeStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppSaleTimeMapper;
import com.simon.cloud.leaf.provider.service.AppSaleTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppSaleTimeServiceImpl implements AppSaleTimeService {

    @Autowired
    AppSaleTimeMapper appSaleTimeMapper;

    @Override
    public ReturnValue add(AppSaleTime record) throws BusinessException {
        record.setStoreId(1L);
        record.setSaleTimeStatus(SaleTimeStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appSaleTimeMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppSaleTime record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appSaleTimeMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppSaleTime record = new AppSaleTime();
        record.setId(id);
        record.setSaleTimeStatus(SaleTimeStatus.UNAVAILABLE.getValue());
        return ReturnValue.success().setData(appSaleTimeMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppSaleTimeExample example = new AppSaleTimeExample();
        AppSaleTimeExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andSaleTimeStatusEqualTo(SaleTimeStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appSaleTimeMapper.selectByExample(example));
    }
}
