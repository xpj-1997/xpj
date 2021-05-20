package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.service.impl
 * @ClassName: UserServiceImpl
 * @Author: xpj
 * @Date: 2021/5/8 下午 5:47
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao ud;
    @Override
    public User queryOne(String account) {
        return ud.selectByAccount(account);
    }
}
