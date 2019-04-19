package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppGoodsUnit;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

public interface AppGoodsUnitService {

    ReturnValue add(AppGoodsUnit record) throws BusinessException;

    ReturnValue edit(AppGoodsUnit record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;
}
