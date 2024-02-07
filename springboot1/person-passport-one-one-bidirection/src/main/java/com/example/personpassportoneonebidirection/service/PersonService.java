package com.example.personpassportoneonebidirection.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personpassportoneonebidirection.entity.Person;
import com.example.personpassportoneonebidirection.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
}
