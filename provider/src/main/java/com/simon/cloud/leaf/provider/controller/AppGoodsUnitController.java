package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsUnit;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.service.AppGoodsUnitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppGoodsUnitController {

    @Autowired
    private AppGoodsUnitService appGoodsUnitService;

    @PostMapping(value = "/appGoodsUnit/add")
    public ReturnValue add(@RequestBody AppGoodsUnit record) {
        return appGoodsUnitService.add(record);
    }

    @PostMapping(value = "/appGoodsUnit/edit")
    public ReturnValue edit(@RequestBody AppGoodsUnit record) {
        return appGoodsUnitService.edit(record);
    }

    @GetMapping(value = "/appGoodsUnit/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appGoodsUnitService.del(id);
    }

    @GetMapping(value = "/appGoodsUnit/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appGoodsUnitService.selectByStoreId(storeId);
    }

}
