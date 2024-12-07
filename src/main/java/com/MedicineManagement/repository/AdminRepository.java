package com.MedicineManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedicineManagement.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByUsername(String username);

}
