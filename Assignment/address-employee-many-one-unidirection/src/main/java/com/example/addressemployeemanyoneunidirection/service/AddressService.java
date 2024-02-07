package com.example.addressemployeemanyoneunidirection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.addressemployeemanyoneunidirection.entity.Address;
import com.example.addressemployeemanyoneunidirection.repository.AddressRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address){
        return addressRepository.save(address);
    }

    public List<Address> getAllAddress(){
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id){
        return addressRepository.findById(id).get();
    }

    public void deleteAddress(Long id){
        addressRepository.deleteById(id);
    }
}
