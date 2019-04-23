package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoods;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.service.AppGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppGoodsController {

    @Autowired
    private AppGoodsService appGoodsService;

    @PostMapping(value = "/appGoods/add")
    public ReturnValue add(@RequestBody AppGoods record) {
        return appGoodsService.add(record);
    }

    @PostMapping(value = "/appGoods/edit")
    public ReturnValue edit(@RequestBody AppGoods record) {
        return appGoodsService.edit(record);
    }

    @GetMapping(value = "/appGoods/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appGoodsService.del(id);
    }

    @GetMapping(value = "/appGoods/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appGoodsService.selectByStoreId(storeId);
    }

}
