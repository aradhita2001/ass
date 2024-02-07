package com.example.addressemployeemanyonebidirectional.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressemployeemanyonebidirectional.entity.Address;
import com.example.addressemployeemanyonebidirectional.repository.AddressRepository;
import com.example.addressemployeemanyonebidirectional.repository.EmployeeRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    public Address getAddressById (Long id){
        return addressRepository.findById(id).get();
    }

    public Address addAddress(Address address){
        return addressRepository.save(address);
    }

    public Address addAddressExistingEmployee(Address address){
        address.setEmployee(employeeRepository.findById(address.getEmployee().getId()).get());
        return addressRepository.save(address);
    }
}
