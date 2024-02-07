package com.example.addressemployeemanyonebidirectional.service;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressemployeemanyonebidirectional.entity.Address;
import com.example.addressemployeemanyonebidirectional.entity.Employee;
import com.example.addressemployeemanyonebidirectional.repository.AddressRepository;
import com.example.addressemployeemanyonebidirectional.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    AddressRepository addressRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee addEmployeeExistingAddress(Employee employee){
        List<Address> addresses = employee.getAddress();
        ListIterator<Address> itr = addresses.listIterator();
        
        while (itr.hasNext()) {
            Address address = itr.next();
            if(address.getId() != null){
                itr.set(addressRepository.findById(address.getId()).get());
            }
        }

        return employeeRepository.save(employee);
    }
}
