package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.controller
 * @ClassName: UserController
 * @Author: xpj
 * @Date: 2021/5/8 下午 5:50
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Controller
@Scope("prototype")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("/login")
    public String login(){
        User admin = us.queryOne("admin");
        if (admin != null){
            System.out.println(admin);
            return "hello";
        }return "error";

    }
}
