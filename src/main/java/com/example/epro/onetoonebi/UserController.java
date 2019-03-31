package com.example.epro.onetoonebi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    public ModelAndView getUser()
    {
        return new ModelAndView("adduser");
    }
    public ModelAndView addUser(@ModelAttribute User user, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return new ModelAndView("error");
        }
        return new ModelAndView("adduser");
    }
}
