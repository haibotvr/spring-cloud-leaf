package com.simon.cloud.leaf.provider.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.cloud.leaf.api.entity.AppGoodsTag;
import com.simon.cloud.leaf.api.entity.AppGoodsTagExample;
import com.simon.cloud.leaf.api.enums.status.MenuStatus;
import com.simon.cloud.leaf.api.enums.status.UseStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import com.simon.cloud.leaf.provider.dao.AppGoodsTagMapper;
import com.simon.cloud.leaf.provider.service.AppGoodsTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppGoodsTagServiceImpl implements AppGoodsTagService {

    @Autowired
    AppGoodsTagMapper appGoodsTagMapper;

    @Override
    public ReturnValue add(AppGoodsTag record) throws BusinessException {
        record.setStoreId(1L);
        record.setTagStatus(UseStatus.YES.getValue());
        return ReturnValue.success().setData(appGoodsTagMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppGoodsTag record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appGoodsTagMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppGoodsTag record = new AppGoodsTag();
        record.setId(id);
        record.setTagStatus(UseStatus.NO.getValue());
        return ReturnValue.success().setData(appGoodsTagMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppGoodsTagExample example = new AppGoodsTagExample();
        AppGoodsTagExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andTagStatusEqualTo(UseStatus.YES.getValue());
        return ReturnValue.success().setData(appGoodsTagMapper.selectByExample(example));
    }

    @Override
    public ReturnValue findByPage(StoreInfoQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        AppGoodsTagExample example = new AppGoodsTagExample();
        AppGoodsTagExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(qc.getStoreId());
        criteria.andTagStatusEqualTo(UseStatus.YES.getValue());
        PageInfo<AppGoodsTag> info = new PageInfo<>(appGoodsTagMapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
