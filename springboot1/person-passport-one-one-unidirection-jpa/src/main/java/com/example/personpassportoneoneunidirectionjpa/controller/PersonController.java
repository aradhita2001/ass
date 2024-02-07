package com.example.personpassportoneoneunidirectionjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.personpassportoneoneunidirectionjpa.entity.Person;
import com.example.personpassportoneoneunidirectionjpa.service.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonController {
    

    @Autowired
    PersonService personService;

    @GetMapping("/person")
    public List<Person> getAllPerson() {
        return personService.getAllPersons();
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id).get();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @PostMapping("/person/existingPassport")
    public Person addPersonExistingPassport(@RequestBody Person person) {
        return personService.savePersonExistingPassport(person);
    }

    @DeleteMapping("/person/{id}")
    public void deletePersonById(@PathVariable Long id){
        personService.deletePerson(id);
    }
    
    
    
}
