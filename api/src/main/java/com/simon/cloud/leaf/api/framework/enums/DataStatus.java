package com.simon.cloud.leaf.api.framework.enums;

/**
 * @author simon.wei
 */
public enum DataStatus {

    SUCCESS("成功", 200), ERROR("失败", 0);

    private String name;
    private Integer value;

    DataStatus(String name, Integer value){
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
