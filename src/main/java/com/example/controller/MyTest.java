package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: dangdang_xpj
 * @Package: com.example.controller
 * @ClassName: MyTesT
 * @Author: xpj
 * @Date: 2021/5/7 下午 6:01
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("all")
@Controller
@RequestMapping("/a")
public class MyTest {

    @RequestMapping("/mytest")
    public String mytest(){
        return "hello";
    }
}
