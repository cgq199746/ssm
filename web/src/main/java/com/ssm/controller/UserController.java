package com.ssm.controller;

import com.ssm.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @RequestMapping("/findAll")
    public void findAll(){
        userServices.findAll();
    }
}