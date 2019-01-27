package com.example.epro.controller;

import com.example.epro.model.PersonalInformation;
import com.example.epro.service.PersonalInformationService;
import com.example.epro.service.PersonalInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class PersonalInformationController {

    @Autowired
    private PersonalInformationServiceImpl personalInformationService;


    @RequestMapping("/createPersonalInformation")
    public ModelAndView createPersonalInformation(PersonalInformation personalInformation) {
        personalInformationService.createPersonalInformation(personalInformation);
        return new ModelAndView();
    }

    @RequestMapping("/getPersonalInformation")
    public ModelAndView getPersonalInformation(Integer personId) {
        personalInformationService.getPersonalInformation(personId);
        return new ModelAndView();
    }

    @RequestMapping("/editPersonalInformation")
    public ModelAndView editPersonalInformation(PersonalInformation personalInformation) {
        personalInformationService.createPersonalInformation(personalInformation);
        return new ModelAndView();
    }

    @RequestMapping("/deletePersonalInformation")
    public ModelAndView deletePersonalInformation(PersonalInformation personalInformation) {
        personalInformationService.deletePersonalInformation(personalInformation);
        return  new ModelAndView();
    }

    @RequestMapping("/deletePersonalInformationById")
    public ModelAndView deletePersonalInformation(Integer id) {
        personalInformationService.deletePersonalInformation(id);
        return new ModelAndView();
    }

    @RequestMapping("/getAllPersonalInformationByPaging")
    public ModelAndView getAllPersonalInformation(Integer pageNumber, Integer pageSize) {
         personalInformationService.getAllPersonalInformation(pageNumber, pageSize);
        return new ModelAndView();
    }

    @RequestMapping("/getAllPersonalInformation")
    public ModelAndView getAllPersonalInformation() {
        personalInformationService.getAllPersonalInformation();
        return new ModelAndView();
    }

    @RequestMapping("/getPersonalInformationCount")
    public ModelAndView getPersonalInformationCount() {
        personalInformationService.countPersonalInformation();
        return new ModelAndView();
    }
}
