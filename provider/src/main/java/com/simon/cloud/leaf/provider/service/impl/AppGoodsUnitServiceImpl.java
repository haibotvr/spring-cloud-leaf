package com.simon.cloud.leaf.provider.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.cloud.leaf.api.entity.AppGoodsUnit;
import com.simon.cloud.leaf.api.entity.AppGoodsUnitExample;
import com.simon.cloud.leaf.api.enums.status.UnitStatus;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import com.simon.cloud.leaf.provider.dao.AppGoodsUnitMapper;
import com.simon.cloud.leaf.provider.service.AppGoodsUnitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class AppGoodsUnitServiceImpl implements AppGoodsUnitService {

    @Autowired
    AppGoodsUnitMapper appGoodsUnitMapper;

    @Override
    public ReturnValue add(AppGoodsUnit record) throws BusinessException {
        record.setStoreId(1L);
        record.setUnitStatus(UnitStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsUnitMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(AppGoodsUnit record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success().setData(appGoodsUnitMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        AppGoodsUnit record = new AppGoodsUnit();
        record.setId(id);
        record.setUnitStatus(UnitStatus.UNAVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsUnitMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue selectByStoreId(Long storeId) throws BusinessException {
        //1.从缓存中获取
        //2.从数据库获取
        AppGoodsUnitExample example = new AppGoodsUnitExample();
        AppGoodsUnitExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(storeId);
        criteria.andUnitStatusEqualTo(UnitStatus.AVAILABLE.getValue());
        return ReturnValue.success().setData(appGoodsUnitMapper.selectByExample(example));
    }

    @Override
    public ReturnValue findByPage(StoreInfoQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        AppGoodsUnitExample example = new AppGoodsUnitExample();
        AppGoodsUnitExample.Criteria criteria = example.createCriteria();
        criteria.andStoreIdEqualTo(qc.getStoreId());
        criteria.andUnitStatusEqualTo(UnitStatus.AVAILABLE.getValue());
        PageInfo<AppGoodsUnit> info = new PageInfo<>(appGoodsUnitMapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
