package com.example.addressemployeemanyoneunidirection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressemployeemanyoneunidirection.entity.Employee;
import com.example.addressemployeemanyoneunidirection.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee (){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
