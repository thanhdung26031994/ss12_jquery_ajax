package com.example.phonesmanagementajaxwebservice.service;

import com.example.phonesmanagementajaxwebservice.model.Smartphone;
import com.example.phonesmanagementajaxwebservice.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SmartphoneService implements ISmartphoneService{
    @Autowired
    private ISmartphoneRepository smartphoneRepository;
    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        smartphoneRepository.deleteById(id);
    }
}
