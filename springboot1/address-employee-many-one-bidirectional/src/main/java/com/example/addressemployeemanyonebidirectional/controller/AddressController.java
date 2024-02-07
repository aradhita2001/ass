package com.example.addressemployeemanyonebidirectional.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressemployeemanyonebidirectional.entity.Address;
import com.example.addressemployeemanyonebidirectional.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PostMapping("/existingEmployee")
    public Address addAddressExistingEmployee(@RequestBody Address address) {
        return addressService.addAddressExistingEmployee(address);
    }
    
}
