package org.apache.test;

import org.apache.dao.UserDao;
import org.apache.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.test
 * @ClassName: UserDaoTest
 * @Author: xpj
 * @Date: 2021/4/26 下午 3:12
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-core.xml")
public class UserDaoTest {

    @Autowired
    UserDao ud;
    @Test
    public void selectByAccount() {
        User admin = ud.selectByAccount("admin");
        System.out.println(admin);
    }
}