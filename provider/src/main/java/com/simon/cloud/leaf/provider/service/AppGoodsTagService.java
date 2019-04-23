package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppGoodsTag;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

public interface AppGoodsTagService {

    ReturnValue add(AppGoodsTag record) throws BusinessException;

    ReturnValue edit(AppGoodsTag record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;
}
