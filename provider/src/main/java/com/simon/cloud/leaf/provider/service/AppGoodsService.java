package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppGoodsWithBLOBs;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;

public interface AppGoodsService {

    ReturnValue add(AppGoodsWithBLOBs record) throws BusinessException;

    ReturnValue edit(AppGoodsWithBLOBs record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;

    ReturnValue findByPage(StoreInfoQC qc) throws BusinessException;
}
