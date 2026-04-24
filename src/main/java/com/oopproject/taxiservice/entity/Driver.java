package com.oopproject.taxiservice.entity;
import jakarta.persistence.*;

public class Driver {
    private String firstName;
    private String lastName;
    private String hireDate;
    private double salary;

    public Driver(String firstName,String lastName,String hireDate,double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.hireDate=hireDate;
        this.salary=salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
