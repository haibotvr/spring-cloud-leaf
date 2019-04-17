package com.simon.cloud.leaf.api.enums.status;

/**
 * @author simon.wei
 */
public enum UseableStatus {

    NO("不可用", 0),
    YES("可用", 1);

    private String name;
    private Integer value;

    UseableStatus(String name, Integer value){
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
