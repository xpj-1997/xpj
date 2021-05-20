package com.example.demo;

import com.example.Application;
import com.example.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.demo
 * @ClassName: MyTestUser
 * @Author: xpj
 * @Date: 2021/5/8 上午 11:04
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTestUser {
    @Autowired
    User user;

    @Test
    public void testLombok(){
        System.out.println(user);
    }

}
