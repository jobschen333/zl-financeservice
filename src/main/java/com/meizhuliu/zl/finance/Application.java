package com.meizhuliu.zl.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chxy
 * @date 2021/6/12 09:51
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.meizhuliu.zl.finance.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
