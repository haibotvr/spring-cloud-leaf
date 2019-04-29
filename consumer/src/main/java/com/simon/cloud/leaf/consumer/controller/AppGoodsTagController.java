package com.simon.cloud.leaf.consumer.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsTag;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/appGoodsTag")
public class AppGoodsTagController {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ReturnValue add(@RequestBody AppGoodsTag record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoodsTag/add", record, ReturnValue.class);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ReturnValue edit(@RequestBody AppGoodsTag record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoodsTag/edit", record, ReturnValue.class);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ReturnValue del(Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoodsTag/del/" + id, ReturnValue.class);
    }

    @RequestMapping(value = "/selectByStoreId", method = RequestMethod.GET)
    public ReturnValue selectByStoreId(Long storeId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoodsTag/selectByStoreId/" + storeId, ReturnValue.class);
    }

}
