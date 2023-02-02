package com.kgisl.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kgisl.springmvc.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    
  @Autowired
  private SessionFactory sessionFactory;
    
    @Override
    public List<Employee> getEmployees() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < Employee > cq = cb.createQuery(Employee.class);
        Root < Employee > root = cq.from(Employee.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void saveCustomer(Employee theEmployee) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theEmployee);
        
    }

    @Override
    public void deleteEmployee(int theId) {
        Session session = sessionFactory.getCurrentSession();
        Employee book = session.byId(Employee.class).load(theId);
        session.delete(book);
        
    }
    
}
