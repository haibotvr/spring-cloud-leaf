package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppGoods;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

public interface AppGoodsService {

    ReturnValue add(AppGoods record) throws BusinessException;

    ReturnValue edit(AppGoods record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;
}
