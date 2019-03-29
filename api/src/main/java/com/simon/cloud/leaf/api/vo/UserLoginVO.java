package com.simon.cloud.leaf.api.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @author simon.wei
 */
@NoArgsConstructor
@Data
public class UserLoginVO implements Serializable {

    /**
     * 用户名
     */
    @NotBlank
    private String username;

    /**
     * 密码
     */
    @NotBlank
    private String password;

    /**
     * 验证码
     */
    @NotBlank
    private String code;

}
