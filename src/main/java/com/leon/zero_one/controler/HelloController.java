package com.leon.zero_one.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello Spring Boot！这是一个用Spring Boots开发的网站。";
    }
}
