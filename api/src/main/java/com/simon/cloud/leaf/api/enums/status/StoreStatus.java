package com.simon.cloud.leaf.api.enums.status;

/**
 * @author simon.wei
 */
public enum StoreStatus {

    CREATE("新创建", 0),
    CHECK("待审核", 1),
    PASS("审核通过", 2),
    REJECT("审核拒绝", 3),
    FREEZE("冻结", 4);

    private String name;
    private Integer value;

    StoreStatus(String name, Integer value){
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
