package com.simon.cloud.leaf.api.enums.status;

/**
 * @author simon.wei
 */
public enum GoodsStatus {

    UNAVAILABLE("不可用", 0),
    AVAILABLE("可用", 1),
    SOLDOUT("已售罄", 2);

    private String name;
    private Integer value;

    GoodsStatus(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

}
