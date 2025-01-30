package com.anas.springmvc.dao;

import com.anas.springmvc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
}
