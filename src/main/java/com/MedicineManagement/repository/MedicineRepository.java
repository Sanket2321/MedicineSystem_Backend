package com.MedicineManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.model.Medicine;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
