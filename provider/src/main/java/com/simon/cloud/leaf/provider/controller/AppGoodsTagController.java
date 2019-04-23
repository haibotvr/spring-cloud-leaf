package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsTag;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.provider.service.AppGoodsTagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppGoodsTagController {

    @Autowired
    private AppGoodsTagService appGoodsTagService;

    @PostMapping(value = "/appGoodsTag/add")
    public ReturnValue add(@RequestBody AppGoodsTag record) {
        return appGoodsTagService.add(record);
    }

    @PostMapping(value = "/appGoodsTag/edit")
    public ReturnValue edit(@RequestBody AppGoodsTag record) {
        return appGoodsTagService.edit(record);
    }

    @GetMapping(value = "/appGoodsTag/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appGoodsTagService.del(id);
    }

    @GetMapping(value = "/appGoodsTag/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appGoodsTagService.selectByStoreId(storeId);
    }

}
