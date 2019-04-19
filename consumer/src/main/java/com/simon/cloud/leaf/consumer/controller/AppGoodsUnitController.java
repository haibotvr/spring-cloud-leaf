package com.simon.cloud.leaf.consumer.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsUnit;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/appGoodUnit")
public class AppGoodsUnitController {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ReturnValue add(AppGoodsUnit record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoodsUnit/add", record, ReturnValue.class);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ReturnValue edit(AppGoodsUnit record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoodsUnit/edit", record, ReturnValue.class);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ReturnValue del(Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoodsUnit/del/" + id, ReturnValue.class);
    }

    @RequestMapping(value = "/selectByStoreId", method = RequestMethod.GET)
    public ReturnValue selectByStoreId(Long storeId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoodsUnit/selectByStoreId/" + storeId, ReturnValue.class);
    }

}
