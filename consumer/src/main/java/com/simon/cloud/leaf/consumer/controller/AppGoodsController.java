package com.simon.cloud.leaf.consumer.controller;

import com.simon.cloud.leaf.api.entity.AppGoodsWithBLOBs;
import com.simon.cloud.leaf.api.framework.web.ReturnValue;
import com.simon.cloud.leaf.api.qc.StoreInfoQC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/appGoods")
public class AppGoodsController {

    private static final String REST_URL_PREFIX = "http://PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ReturnValue add(@RequestBody AppGoodsWithBLOBs record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoods/add", record, ReturnValue.class);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ReturnValue edit(@RequestBody AppGoodsWithBLOBs record) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoods/edit", record, ReturnValue.class);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ReturnValue del(Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoods/del/" + id, ReturnValue.class);
    }

    @RequestMapping(value = "/selectByStoreId", method = RequestMethod.GET)
    public ReturnValue selectByStoreId(Long storeId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/appGoods/selectByStoreId/" + storeId, ReturnValue.class);
    }

    @RequestMapping(value = "/findByPage", method = RequestMethod.POST)
    public ReturnValue findByPage(@RequestBody StoreInfoQC qc) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/appGoods/findByPage",  qc, ReturnValue.class);
    }

}
