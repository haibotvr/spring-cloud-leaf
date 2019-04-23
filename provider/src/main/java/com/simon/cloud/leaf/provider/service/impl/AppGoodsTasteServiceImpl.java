package com.simon.cloud.leaf.provider.service.impl;

import com.simon.cloud.leaf.api.entity.AppGoodsTaste;
import com.simon.cloud.leaf.api.entity.AppGoodsTasteExample;
import com.simon.cloud.leaf.api.enums.status.UseStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.dao.AppGoodsTasteMapper;
import com.simon.cloud.leaf.provider.service.AppGoodsTasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AppGoodsTasteServiceImpl implements AppGoodsTasteService {

    @Autowired
    AppGoodsTasteMapper appGoodsTasteMapper;

    @Override
    public ReturnValue add(AppGoodsTaste record) throws BusinessException {
        record.setStoreId(1L);
        record.setTasteStatus(UseStatus.YES.getValue());
        return ReturnValue.success().setData(appGoodsTasteMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppGoodsTaste record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appGoodsTasteMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppGoodsTaste record = new AppGoodsTaste();
        record.setId(id);
        record.setTasteStatus(UseStatus.NO.getValue());
        return ReturnValue.success().setData(appGoodsTasteMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppGoodsTasteExample example = new AppGoodsTasteExample();
        AppGoodsTasteExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andTasteStatusEqualTo(UseStatus.YES.getValue());
        return ReturnValue.success().setData(appGoodsTasteMapper.selectByExample(example));
    }
}
