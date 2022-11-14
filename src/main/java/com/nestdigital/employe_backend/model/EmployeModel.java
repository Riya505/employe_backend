package com.nestdigital.employe_backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class EmployeModel {

    @Id
    @GeneratedValue
    private int id;
    private int emp_code;
    private String name;
    private String designation;
    private String dob;
    private int salary;
    private String companyName;

    public EmployeModel() {
    }

    public EmployeModel(int id, int emp_code, String name, String designation, String dob, int salary, String companyName) {
        this.id = id;
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        this.dob = dob;
        this.salary = salary;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(int emp_code) {
        this.emp_code = emp_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
