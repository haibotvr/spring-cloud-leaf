package com.simon.cloud.leaf.api.enums.status;

/**
 * @author simon.wei
 */
public enum SaleTimeStatus {

    UNAVAILABLE("不可用", 0),
    AVAILABLE("可用", 1);

    private String name;
    private Integer value;

    SaleTimeStatus(String name, Integer value){
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
