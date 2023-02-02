package com.kgisl.springmvc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int EmployeeId;
    private String EmployeeName;
    private String Dob;
    private String AllocatedProject;
    private String KnownModel;
    private String Email;
    private long Phonenumber;

    
   
    public Employee() {
    }

    
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }
    public String getDob() {
        return Dob;
    }
    public void setDob(String dob) {
        Dob = dob;
    }
    public String getAllocatedProject() {
        return AllocatedProject;
    }
    public void setAllocatedProject(String allocatedProject) {
        AllocatedProject = allocatedProject;
    }
    public String getKnownModel() {
        return KnownModel;
    }
    public void setKnownModel(String knownModel) {
        KnownModel = knownModel;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public long getPhonenumber() {
        return Phonenumber;
    }
    public void setPhonenumber(long phonenumber) {
        Phonenumber = phonenumber;
    }


    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Dob=" + Dob
                + ", AllocatedProject=" + AllocatedProject + ", KnownModel=" + KnownModel + ", Email=" + Email
                + ", Phonenumber=" + Phonenumber + "]";
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
   
    

}
