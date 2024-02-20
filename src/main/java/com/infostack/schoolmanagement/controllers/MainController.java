package com.infostack.schoolmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping("")
    public String homepage(){
        return "sample";
    }

    @RequestMapping("about")
    public String aboutpage(){
        return "about";
    }

    @RequestMapping("services")
    public String servicespage(){
        return "services";
    }

    @RequestMapping("contact")
    public String contactpage(){
        return "contact";
    }
}
