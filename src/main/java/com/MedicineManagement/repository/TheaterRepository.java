package com.MedicineManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

	
 
}
