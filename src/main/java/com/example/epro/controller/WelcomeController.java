package com.example.epro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        System.out.println("inside welcome");
        return "welcome";
    }
    @RequestMapping("/test1")
    public String test1(Map<String, Object> model) {
        return "test1";
    }

    @RequestMapping("/index")
    public String index() {
        System.out.println("inside welcome");
        return "index";
    }
    @RequestMapping("/index1")
    public String index1() {
        System.out.println("inside welcome1");
        return "index1";
    }
    @RequestMapping("/login")
    public String login() {
        System.out.println("inside login");
        return "index";
    }
    @RequestMapping("/savepersinfo")
    public String savepersinfo() {
        System.out.println("inside savepersinfo");
        return "index";
    }
}