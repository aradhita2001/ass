package com.example.personpassportoneonebidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personpassportoneonebidirection.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
