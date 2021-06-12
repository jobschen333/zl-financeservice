package com.meizhuliu.zl.finance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chxy
 * @date 2021/6/12 11:26
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String  hello(){
        return "hello world";
    }
    //REST API
}
