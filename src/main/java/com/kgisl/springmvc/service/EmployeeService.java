package com.kgisl.springmvc.service;

import java.util.List;

import com.kgisl.springmvc.entity.Employee;

public interface EmployeeService {

    public List<Employee> getEmployees() ;

    public void saveEmployee(Employee theEmployee) ;

    public void deleteEmployee(int theId);
    
}
