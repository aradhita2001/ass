package com.example.addressemployeemanyonebidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addressemployeemanyonebidirectional.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
    
}
