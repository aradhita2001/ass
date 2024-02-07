package com.example.personpassportoneoneunidirectionjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personpassportoneoneunidirectionjpa.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long>{
    
}
