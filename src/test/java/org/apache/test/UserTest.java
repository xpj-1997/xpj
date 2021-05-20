package org.apache.test;

import org.apache.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @ProjectName: dangdang_xpj
 * @Package: org.apache.test
 * @ClassName: UserTest
 * @Author: xpj
 * @Date: 2021/3/24 下午 4:45
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
public class UserTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-core.xml");
        User user = (User) ctx.getBean("user");
        System.out.println(user);
    }
}