package com.example.post_status_checking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.example.post_status_checking.entity.Employee;

@Service
public class EmployeeService {
    List<Employee> employees;

    public EmployeeService(){
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee deletEmployee(int id){
        ListIterator<Employee> itr = employees.listIterator();

        Employee employee = null;

        while (itr.hasNext()) {
            employee = itr.next();
            if(employee.getId().equals(id)) {
                itr.remove();
                return employee;
            }
        }
        return null;
    }
}
