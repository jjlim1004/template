package com.template.controller;

import com.template.dto.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    private Log looger = LogFactory.getLog(UserController.class);

    @GetMapping("/create-user")
    public String createUser(ModelMap model){
        model.addAttribute("user",new User());
        return "user";
    }

    @PostMapping("/create-user")
    public String createUser(User user){
        looger.info(user);
        return "redirect:list-users";
    }

    @GetMapping("/list_users")
    public String showAllUsers(){
        return"list-users";
    }

    @PostMapping("create-user-with-valid")
    public String addTodo(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "user";
        }

        return "redirect:list-users";
    }

}
