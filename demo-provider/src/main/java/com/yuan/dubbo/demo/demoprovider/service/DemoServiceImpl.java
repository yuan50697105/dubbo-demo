package com.yuan.dubbo.demo.demoprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuan.dubbo.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Service(interfaceClass = DemoService.class)
@Component
public class DemoServiceImpl implements DemoService {
    Logger logger=LoggerFactory.getLogger(this.getClass());
    @Override
    public String hello(String name) {
        logger.info("get "+name);
        return "Hello "+name;

    }
}
