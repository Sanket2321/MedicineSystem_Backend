package com.MedicineManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}


