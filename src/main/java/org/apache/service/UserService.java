package org.apache.service;

import org.apache.entity.User;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.service
 * @ClassName: UserService
 * @Author: xpj
 * @Date: 2021/4/26 下午 5:36
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public interface UserService {
    User queryOne(String account, String password);

    void addUser(User user);
}
