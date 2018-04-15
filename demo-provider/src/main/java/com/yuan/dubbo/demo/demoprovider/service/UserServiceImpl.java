package com.yuan.dubbo.demo.demoprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuan.dubbo.demo.model.User;
import com.yuan.dubbo.demo.service.UserService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User(1,"name","pwd");
    }
}
