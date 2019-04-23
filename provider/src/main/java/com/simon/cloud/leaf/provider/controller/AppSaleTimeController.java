package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppSaleTime;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.service.AppSaleTimeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppSaleTimeController {

    @Autowired
    private AppSaleTimeService appSaleTimeService;

    @PostMapping(value = "/appSaleTime/add")
    public ReturnValue add(@RequestBody AppSaleTime vo) {
        return appSaleTimeService.add(vo);
    }

    @PostMapping(value = "/appSaleTime/edit")
    public ReturnValue edit(@RequestBody AppSaleTime vo) {
        return appSaleTimeService.edit(vo);
    }

    @GetMapping(value = "/appSaleTime/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appSaleTimeService.del(id);
    }

    @GetMapping(value = "/appSaleTime/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appSaleTimeService.selectByStoreId(storeId);
    }

}
