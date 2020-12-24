package com.example.panda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * url跳转页面
 * paddy 2020-12-24
 * */
@Controller
public class UrlController {
    @RequestMapping("/")
    public String index(){return "index";}

    @RequestMapping("/index")
    public String index1(){
        return "index";
    }

}
