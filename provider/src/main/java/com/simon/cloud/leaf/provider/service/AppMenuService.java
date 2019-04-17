package com.simon.cloud.leaf.provider.service;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.framework.exception.BusinessException;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;

public interface AppMenuService {

    ReturnValue add(AppMenu vo) throws BusinessException;

    ReturnValue edit(AppMenu vo) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue selectByStoreId(Long storeId) throws BusinessException;
}
