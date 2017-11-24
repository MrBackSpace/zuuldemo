package com.zuul.zuuldemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ErrorController implements org.springframework.boot.autoconfigure.web.ErrorController{
    @Override
    public String getErrorPath() {
        return "/error";
    }
    @RequestMapping("/error")
    public String error(){
        return "出错了,乖乖";
    }
}
