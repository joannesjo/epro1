package com.example.epro.employee;


import com.example.epro.test.Student;
import com.example.epro.test.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class EmployeeController{

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeAddressRepository employeeAddressRepository;

    @GetMapping("/testvalid")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employee", new Employee());
        modelAndView.setViewName("form");
        return modelAndView;
    }

    @PostMapping("/testvalid")
    public String checkPersonInfo(@ModelAttribute("employee") @Valid Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        Employee employee1 = new Employee();
        employee1.setEmpId(employee.getEmpId());
        employee1.setEmpName(employee.getEmpName());
        employeeRepository.save(employee1);
        Employee_Address employee_address = new Employee_Address();
        employee_address.setStreet(employee.getEmployeeAddress().getStreet());
        employee_address.setEmployee(employee1);
        employeeAddressRepository.save(employee_address);
        return "results";
    }
}
