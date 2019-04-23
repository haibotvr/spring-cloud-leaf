package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppGoods;
import com.simon.cloud.leaf.api.entity.AppGoodsExample;
import com.simon.cloud.leaf.api.entity.AppGoodsWithBLOBs;
import com.simon.cloud.leaf.api.enums.status.GoodsStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppGoodsMapper;
import com.simon.cloud.leaf.provider.service.AppGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppGoodsServiceImpl implements AppGoodsService {

    @Autowired
    AppGoodsMapper appGoodsMapper;

    @Override
    public ReturnValue add(AppGoodsWithBLOBs record) throws BusinessException {
        record.setStoreId(1L);
        record.setGoodsStatus(GoodsStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppGoodsWithBLOBs record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appGoodsMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppGoodsWithBLOBs record = new AppGoodsWithBLOBs();
        record.setId(id);
        record.setGoodsStatus(GoodsStatus.UNAVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppGoodsExample example = new AppGoodsExample();
        AppGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andGoodsStatusEqualTo(GoodsStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsMapper.selectByExampleWithBLOBs(example));
    }
}
