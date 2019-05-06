package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsTaste;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import com.simon.cloud.leaf.provider.service.AppGoodsTasteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppGoodsTasteController {

    @Autowired
    private AppGoodsTasteService appGoodsTasteService;

    @PostMapping(value = "/appGoodsTaste/add")
    public ReturnValue add(@RequestBody AppGoodsTaste record) {
        return appGoodsTasteService.add(record);
    }

    @PostMapping(value = "/appGoodsTaste/edit")
    public ReturnValue edit(@RequestBody AppGoodsTaste record) {
        return appGoodsTasteService.edit(record);
    }

    @GetMapping(value = "/appGoodsTaste/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appGoodsTasteService.del(id);
    }

    @GetMapping(value = "/appGoodsTaste/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appGoodsTasteService.selectByStoreId(storeId);
    }

    @PostMapping(value = "/appGoodsTaste/findByPage")
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return appGoodsTasteService.findByPage(qc);
    }

}
