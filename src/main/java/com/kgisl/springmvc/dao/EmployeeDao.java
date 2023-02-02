package com.kgisl.springmvc.dao;

import java.util.List;

import com.kgisl.springmvc.entity.Employee;

public interface EmployeeDao {

    List<Employee> getEmployees();

    void saveCustomer(Employee theEmployee);

    void deleteEmployee(int theId);
    
}
