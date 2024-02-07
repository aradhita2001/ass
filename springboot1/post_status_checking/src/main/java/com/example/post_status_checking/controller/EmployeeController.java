package com.example.post_status_checking.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.post_status_checking.service.EmployeeService;
import com.example.post_status_checking.entity.Employee;
import com.example.post_status_checking.exception.EmployeeNotFoundException;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    
    @GetMapping("")
    public ResponseEntity<List<Employee>> getList() {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path="/{id}")
    public void deleteEmployee(@PathVariable int id) throws Exception{
        Employee employee = employeeService.deletEmployee(id);

        if(employee == null) throw new EmployeeNotFoundException("id = " + id);
    }
    
    
}
