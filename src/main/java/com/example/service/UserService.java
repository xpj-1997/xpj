package com.example.service;

import com.example.entity.User;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.service
 * @ClassName: UserService
 * @Author: xpj
 * @Date: 2021/5/8 下午 5:46
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("ALL")
public interface UserService {
    User queryOne(String account);
}
