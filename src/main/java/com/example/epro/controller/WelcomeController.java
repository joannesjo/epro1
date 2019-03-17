package com.example.epro.controller;

import com.example.epro.test.CategoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class WelcomeController {

    @RequestMapping("/addCategoryView")
    public ModelAndView addCategory() {
        System.out.println("inside addCategory");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("category", new CategoryBean());
        modelAndView.setViewName("addCategory");
        return modelAndView;
    }
    @RequestMapping("/addPublication")
    public String addPublication() {
        System.out.println("inside addPublication");
        return "addPublication";
    }
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
    @RequestMapping("/index2")
    public String index2() {
        System.out.println("inside index2");
        return "index2";
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