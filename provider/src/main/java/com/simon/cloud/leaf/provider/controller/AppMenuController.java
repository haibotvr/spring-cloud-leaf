package com.simon.cloud.leaf.provider.controller;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.vo.UserLoginVO;
import com.simon.cloud.leaf.provider.service.AppMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppMenuController {

    @Autowired
    private AppMenuService appMenuService;

    @PostMapping(value = "/appMenu/add")
    public ReturnValue add(@RequestBody AppMenu vo) {
        return appMenuService.add(vo);
    }

    @PostMapping(value = "/appMenu/edit")
    public ReturnValue edit(@RequestBody AppMenu vo) {
        return appMenuService.edit(vo);
    }

    @PostMapping(value = "/appMenu/del")
    public ReturnValue del(Long id) {
        return appMenuService.del(id);
    }

    @PostMapping(value = "/appMenu/selectByStoreId")
    public ReturnValue selectByStoreId(Long storeId) {
        return appMenuService.selectByStoreId(storeId);
    }

}
