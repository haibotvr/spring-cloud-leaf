package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppGoodsCategory;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

/**
 * @author simon.wei
 */
public interface AppGoodsCategoryService {

    ReturnValue add(AppGoodsCategory record) throws BusinessException;

    ReturnValue edit(AppGoodsCategory record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;

}
