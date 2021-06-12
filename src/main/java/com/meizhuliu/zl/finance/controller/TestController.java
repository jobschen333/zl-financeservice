package com.meizhuliu.zl.finance.controller;

import com.meizhuliu.zl.finance.domian.UserAccountsDO;
import com.meizhuliu.zl.finance.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chxy
 * @date 2021/6/12 09:58
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ConfigurableApplicationContext context;

    @Autowired
    private TestMapper testMapper;



    @RequestMapping("test")
    public void test() {

        UserAccountsDO userAccountsDO = testMapper.listById(11L);
        System.out.println("userAccount={}"+ userAccountsDO);
        System.out.println();

    }

}
