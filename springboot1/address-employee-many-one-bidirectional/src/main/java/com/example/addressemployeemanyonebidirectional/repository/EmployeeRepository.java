package com.example.addressemployeemanyonebidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressemployeemanyonebidirectional.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
