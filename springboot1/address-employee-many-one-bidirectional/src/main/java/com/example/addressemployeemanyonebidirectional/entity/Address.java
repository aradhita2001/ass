package com.example.addressemployeemanyonebidirectional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String details;
    private Integer pincode;

    @ManyToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public Address() {
    }

    public Address(String details, Integer pincode, Employee employee) {
        this.details = details;
        this.pincode = pincode;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
}
