package com.customerService.model;

import java.sql.Date;
import java.time.LocalDate;

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String address;
    private Date joiningDate;
    private CustomerStatus status;


    public Customer(Long id, String firstName, String lastName, String email, int age, String address, Date joiningDate, CustomerStatus status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.joiningDate = joiningDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }
}
