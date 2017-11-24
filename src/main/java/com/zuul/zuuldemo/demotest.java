package com.zuul.zuuldemo;

import org.springframework.web.bind.annotation.RequestMapping;


public class demotest {
    @RequestMapping("club")
    public String index(){
        return "hello,我是club";
    }
    @RequestMapping("user")
    public String user(){
        return "hello,我是user";
    }
}
