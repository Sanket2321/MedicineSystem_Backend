package com.MedicineManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedicineManagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	

}
