package com.kgisl.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgisl.springmvc.dao.EmployeeDao;
import com.kgisl.springmvc.entity.Employee;
@Service
public class EmployeeServiceImple implements EmployeeService {


    @Autowired
    private EmployeeDao employeeDao;
    
    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        employeeDao.saveCustomer(theEmployee);        
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeDao.deleteEmployee(theId);
        
    }
    
}
