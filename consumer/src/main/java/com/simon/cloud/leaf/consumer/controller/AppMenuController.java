package com.simon.cloud.leaf.consumer.controller;

import com.simon.cloud.leaf.api.entity.AppMenu;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/appMenu")
public class AppMenuController {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ReturnValue add(@RequestBody AppMenu record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appMenu/add", record, ReturnValue.class);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ReturnValue edit(@RequestBody AppMenu record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appMenu/edit", record, ReturnValue.class);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ReturnValue del(Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appMenu/del/" + id, ReturnValue.class);
    }

    @RequestMapping(value = "/selectByStoreId", method = RequestMethod.GET)
    public ReturnValue selectByStoreId(Long storeId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appMenu/selectByStoreId/" + storeId, ReturnValue.class);
    }

    @RequestMapping(value = "/findByPage", method = RequestMethod.POST)
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appMenu/findByPage",  qc, ReturnValue.class);
    }

}
