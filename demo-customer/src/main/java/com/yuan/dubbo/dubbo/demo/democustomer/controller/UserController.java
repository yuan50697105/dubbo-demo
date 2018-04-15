package com.yuan.dubbo.dubbo.demo.democustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yuan.dubbo.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.yuan.dubbo.demo.service.DemoService;
@Controller
public class UserController {
    @Reference(url = "dubbo://127.0.0.1:20880",interfaceClass = DemoService.class)
    private DemoService demoService;
    @Reference(url = "dubbo://127.0.0.1:20880",interfaceClass = UserService.class)
    private UserService userService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return demoService.hello("name");
    }

    @RequestMapping(value = "/get/user")
    public String getUser(Model model){
        model.addAttribute("user",userService.getUser());
        return "user";
    }
}
