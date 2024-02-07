package com.example.addressemployeemanyoneunidirection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressemployeemanyoneunidirection.entity.Address;
import com.example.addressemployeemanyoneunidirection.service.AddressService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/address")
public class AddressController {
    
    @Autowired
    private AddressService addressService;

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long  id) {
        return addressService.getAddressById(id);
    }

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PostMapping
    public Address addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id){
        addressService.deleteAddress(id);
    }
    
    
}
