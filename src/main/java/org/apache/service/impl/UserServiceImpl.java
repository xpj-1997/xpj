package org.apache.service.impl;

import org.apache.dao.UserDao;
import org.apache.entity.User;
import org.apache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.service.impl
 * @ClassName: UserServiceImpl
 * @Author: xpj
 * @Date: 2021/4/27 上午 8:37
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Service
@Transactional(propagation = Propagation.REQUIRED)

/*
 *  Propagation.REQUIRED 事务控制的默认值 事务是必须的
 *  如果外层有事务，则主动加入未曾事务，如过外层没有事务则创建新的事务
 *  主要针对写操作
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao ud;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    /*
         Propagation.SUPPORTS 支持事务
         如果外层有事务，则主动加入到外层事务
         如果外层没有事务，不会主动创建事务
         readOnly = true

    */
    @Override
    public User queryOne(String account,String password) {
        User user = ud.selectByAccount(account);
        if (user != null && user.getPassword().equals(password)) return user;
        else return null;
    }

    @Override
    public void addUser(User user) {

    }
}
