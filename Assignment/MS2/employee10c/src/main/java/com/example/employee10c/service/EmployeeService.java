package com.example.employee10c.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.employee10c.entity.Employee;

@Service
public class EmployeeService {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    
    
    public Employee getEmployeeById(int id){
        for(Employee employee : employees){
            if(employee.getId().equals(id)) return employee;
        }    
        return null;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
