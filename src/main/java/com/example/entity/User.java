package com.example.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.entity
 * @ClassName: User
 * @Author: xpj
 * @Date: 2021/5/8 上午 10:14
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Component
@Data
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {
    private String account;
    private String password;
    private String email;
}
