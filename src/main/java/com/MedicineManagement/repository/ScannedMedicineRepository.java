package com.MedicineManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.model.ScannedMedicine;
@Repository
public interface ScannedMedicineRepository extends JpaRepository<ScannedMedicine, Long>{
	
}
