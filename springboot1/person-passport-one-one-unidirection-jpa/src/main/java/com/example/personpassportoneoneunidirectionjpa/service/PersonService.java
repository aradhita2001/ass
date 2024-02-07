package com.example.personpassportoneoneunidirectionjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personpassportoneoneunidirectionjpa.entity.Passport;
import com.example.personpassportoneoneunidirectionjpa.entity.Person;
import com.example.personpassportoneoneunidirectionjpa.repository.PassportRepository;
import com.example.personpassportoneoneunidirectionjpa.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PassportRepository passportRepository;

    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Long id){
        return personRepository.findById(id);
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Person savePersonExistingPassport(Person person){
        // Passport passport = new Passport();
        // passport.setId(person.getPassport().getId());

        Person person2 = new Person();
        person2.setName(person.getName());
        person2.setPassport(passportRepository.findById(person.getPassport().getId()).get());

        return personRepository.save(person2);
    }

    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
}
