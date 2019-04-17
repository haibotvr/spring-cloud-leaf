package com.simon.cloud.leaf.api.enums.exception;

/**
 * @author simon.wei
 */
public enum BusinessExceptionMessage {

    LOGIN_NAME_OR_PASSWORD_FAULT("用户名或密码错误", 1001),
    LOGIN_NAME_IS_NOT_EXIST("用户名不存在", 1002),
    STORE_ID_IS_NOT_EXIST("店铺ID不存在", 1003);

    private String name;
    private Integer value;

    BusinessExceptionMessage(String name, Integer value){
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
