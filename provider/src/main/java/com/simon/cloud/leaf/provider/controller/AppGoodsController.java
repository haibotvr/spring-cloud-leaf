package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsWithBLOBs;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
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
    public ReturnValue add(@RequestBody AppGoodsWithBLOBs record) {
        return appGoodsService.add(record);
    }

    @PostMapping(value = "/appGoods/edit")
    public ReturnValue edit(@RequestBody AppGoodsWithBLOBs record) {
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

    @PostMapping(value = "/appGoods/findByPage")
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return appGoodsService.findByPage(qc);
    }

}
