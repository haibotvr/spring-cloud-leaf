package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppGoodsCategory;
import com.simon.cloud.leaf.api.entity.AppGoodsCategoryExample;
import com.simon.cloud.leaf.api.enums.status.GoodsCategoryStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppGoodsCategoryMapper;
import com.simon.cloud.leaf.provider.service.AppGoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppGoodsCategoryServiceImpl implements AppGoodsCategoryService {

    @Autowired
    AppGoodsCategoryMapper appGoodsCategoryMapper;

    @Override
    public ReturnValue add(AppGoodsCategory record) throws BusinessException {
        record.setStoreId(1L);
        record.setCategoryStatus(GoodsCategoryStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsCategoryMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppGoodsCategory record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appGoodsCategoryMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppGoodsCategory record = new AppGoodsCategory();
        record.setId(id);
        record.setCategoryStatus(GoodsCategoryStatus.UNAVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsCategoryMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppGoodsCategoryExample example = new AppGoodsCategoryExample();
        AppGoodsCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andCategoryStatusEqualTo(GoodsCategoryStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsCategoryMapper.selectByExample(example));
    }
}
