package com.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @RequestMapping("/welcome" )
    @ResponseBody
    public String welcome(){
        return"welcome";
    }

    @RequestMapping("/welcome-view" )
    public String welcomeView(){
        return"welcome";
    }

    @RequestMapping("/welcome-model-view" )
    public String welcome(ModelMap model){
        model.put("name","this it the name");
        return"welcome-model-map";
    }


}
