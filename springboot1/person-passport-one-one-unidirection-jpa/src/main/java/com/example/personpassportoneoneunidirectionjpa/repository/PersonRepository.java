package com.example.personpassportoneoneunidirectionjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personpassportoneoneunidirectionjpa.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
