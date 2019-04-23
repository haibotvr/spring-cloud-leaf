package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppSaleTime;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

public interface AppSaleTimeService {

    ReturnValue add(AppSaleTime record) throws BusinessException;

    ReturnValue edit(AppSaleTime record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;
}
