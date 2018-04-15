package com.yuan.dubbo.dubbo.demo.democustomer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@EnableDubboConfiguration
public class DemoCustomerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoCustomerApplication.class, args);
        System.in.read();
    }
}
