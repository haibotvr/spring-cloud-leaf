package com.simon.cloud.leaf.api.framework.exception;

import lombok.Data;

@Data
public class AuthenticationException extends RuntimeException {

    private Integer code;
    private String message;

    public AuthenticationException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
