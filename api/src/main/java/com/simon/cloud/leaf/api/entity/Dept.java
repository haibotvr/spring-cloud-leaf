package com.simon.cloud.leaf.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{

    private Long 	id; // 主键
    private String 	dname; // 部门名称

}
