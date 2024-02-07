package com.example.personpassportoneoneunidirectionjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.personpassportoneoneunidirectionjpa.entity.Passport;
import com.example.personpassportoneoneunidirectionjpa.repository.PassportRepository;

@Service
public class PassportService {
    
    @Autowired
    private PassportRepository passportRepository;

    public List<Passport> getAllPassports() {
        return passportRepository.findAll();
    }

    public Optional<Passport> getPassportById(Long id){
        return passportRepository.findById(id);
    }

    public Passport savePassport(Passport passport) {
        return passportRepository.save(passport);
    }

    public void deletePassport(Long id){
        passportRepository.deleteById(id);
    }
}
