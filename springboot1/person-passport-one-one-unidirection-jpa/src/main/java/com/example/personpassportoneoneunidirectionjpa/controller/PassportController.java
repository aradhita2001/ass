package com.example.personpassportoneoneunidirectionjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personpassportoneoneunidirectionjpa.entity.Passport;
import com.example.personpassportoneoneunidirectionjpa.service.PassportService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/passport")
public class PassportController {
    
    @Autowired
    PassportService passportService;

    @GetMapping
    public List<Passport> getAllPassports(){
        return passportService.getAllPassports();
    }

    @GetMapping("/{id}")
    public Passport getPassportById(@PathVariable Long id) {
        return passportService.getPassportById(id).get();
    }

    @PostMapping
    public Passport addPassport(@RequestBody Passport passport) {
        return passportService.savePassport(passport);
    }

    @DeleteMapping("/{id}")
    public void deletePassport(@PathVariable Long id){
        passportService.deletePassport(id);
    }
    
    


}
