package com.meizhuliu.zl.finance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chxy
 * @date 2021/6/12 09:58
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public void test() {

        System.out.println("test 类");
    }

}
