package com.template.controller;

import com.template.dto.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private Log looger = LogFactory.getLog(UserController.class);

    @GetMapping("/create-user")
    public String createUser(ModelMap model){
        model.addAttribute("user",new User());
        return "user";
    }

//    @GetMapping("/create-user")
//    public String createUser(ModelMap model){
//        model.addAttribute("user",new User());
//        return "user";
//    }

}
