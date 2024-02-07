package com.example.personpassportoneonebidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personpassportoneonebidirection.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long>{
    
}

