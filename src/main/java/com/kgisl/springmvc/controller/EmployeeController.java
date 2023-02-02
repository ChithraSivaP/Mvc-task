package com.kgisl.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kgisl.springmvc.entity.Employee;
import com.kgisl.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;



    // @GetMapping("/")
    // public String viewpage(Model theModel) {
    //     return "index";
    // }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> theEmployees = employeeService.getEmployees();
        System.out.println(theEmployees);
        theModel.addAttribute("employees", theEmployees);
        return "index";
    }




    @PostMapping(value="/saveEmployee", headers = "Accept=application/json")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        System.out.println("controller");
        System.out.println(theEmployee);

        employeeService.saveEmployee(theEmployee);
        return "redirect:/list";
    }

    
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("EmpID") int theId) {
        System.out.println(theId);
        employeeService.deleteEmployee(theId);
        return "redirect:/list";
    }
    
}
