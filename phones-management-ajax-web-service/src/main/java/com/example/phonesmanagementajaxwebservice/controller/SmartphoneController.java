package com.example.phonesmanagementajaxwebservice.controller;

import com.example.phonesmanagementajaxwebservice.model.Smartphone;
import com.example.phonesmanagementajaxwebservice.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/api/smartphone")
public class SmartphoneController {
    @Autowired
    private ISmartphoneService smartphoneService;
    @GetMapping
    public ResponseEntity<Iterable<Smartphone>> listSmartphone(){
        return new ResponseEntity<>(smartphoneService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Smartphone> createSmartphone(@RequestBody Smartphone smartphone){
        return new ResponseEntity<>(smartphoneService.save(smartphone), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Smartphone> deleteSmartphoneById(@PathVariable Long id){
        Optional<Smartphone> smartphones = smartphoneService.findById(id);
        if (!smartphones.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        smartphoneService.remove(id);
        return new ResponseEntity<>(smartphones.get(), HttpStatus.OK);
    }
}
