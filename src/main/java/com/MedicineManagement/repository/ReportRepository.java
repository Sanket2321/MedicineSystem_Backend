package com.MedicineManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MedicineManagement.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
	

}
