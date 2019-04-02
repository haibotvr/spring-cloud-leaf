package com.simon.cloud.leaf.provider;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * @author simon.wei
 */
public class Test {

    public static void main(String[] args) throws Exception {
        String publicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKV2SMCZ2c47iBsYnP3uiYTKiYXZpJdqffx3g0kLPkY/YBSbyeYbWG5JRXxscz4oZTR+RZksff2FBwGGxEyafusCAwEAAQ==";
        String password = "OkU2zaaL0hGaDy3opprU9WnCSnbuzQa2vNt0IjP6ZwA9d+fFVYrFVeV04RGsvkJc7tqFc9aWI1O6ugwkEuEdVw==";
        System.out.println(ConfigTools.decrypt(publicKey, password));
    }
}
