package com.hbwang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能描述: 运行
 *
 * @author: wanghongbo
 * @date: 2018/11/20 18:46
 */
@SpringBootApplication
@EnableTransactionManagement
public class MySpringBootApplication {


    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
