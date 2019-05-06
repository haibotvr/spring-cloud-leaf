package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsCategory;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import com.simon.cloud.leaf.provider.service.AppGoodsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppGoodsCategoryController {

    @Autowired
    private AppGoodsCategoryService appGoodsCategoryService;

    @PostMapping(value = "/appGoodsCategory/add")
    public ReturnValue add(@RequestBody AppGoodsCategory record) {
        return appGoodsCategoryService.add(record);
    }

    @PostMapping(value = "/appGoodsCategory/edit")
    public ReturnValue edit(@RequestBody AppGoodsCategory record) {
        return appGoodsCategoryService.edit(record);
    }

    @GetMapping(value = "/appGoodsCategory/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appGoodsCategoryService.del(id);
    }

    @GetMapping(value = "/appGoodsCategory/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appGoodsCategoryService.selectByStoreId(storeId);
    }

    @PostMapping(value = "/appGoodsCategory/findByPage")
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return appGoodsCategoryService.findByPage(qc);
    }

}
