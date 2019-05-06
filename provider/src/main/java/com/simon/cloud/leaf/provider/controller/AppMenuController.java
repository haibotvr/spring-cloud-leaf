package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import com.simon.cloud.leaf.api.vo.UserLoginVO;
import com.simon.cloud.leaf.provider.service.AppMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AppMenuController {

    @Autowired
    private AppMenuService appMenuService;

    @PostMapping(value = "/appMenu/add")
    public ReturnValue add(@RequestBody AppMenu record) {
        return appMenuService.add(record);
    }

    @PostMapping(value = "/appMenu/edit")
    public ReturnValue edit(@RequestBody AppMenu record) {
        return appMenuService.edit(record);
    }

    @GetMapping(value = "/appMenu/del/{id}")
    public ReturnValue del(@PathVariable Long id) {
        return appMenuService.del(id);
    }

    @GetMapping(value = "/appMenu/selectByStoreId/{storeId}")
    public ReturnValue selectByStoreId(@PathVariable Long storeId) {
        return appMenuService.selectByStoreId(storeId);
    }

    @PostMapping(value = "/appMenu/findByPage")
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return appMenuService.findByPage(qc);
    }

}
