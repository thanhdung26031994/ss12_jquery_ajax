package com.example.phonesmanagementajaxwebservice.repository;

import com.example.phonesmanagementajaxwebservice.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends JpaRepository<Smartphone, Long> {
}
