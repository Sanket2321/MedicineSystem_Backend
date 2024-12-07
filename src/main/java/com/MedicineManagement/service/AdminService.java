package com.MedicineManagement.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.Admin;
import com.MedicineManagement.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;
	 public Admin login(String username,String password) {
		 Admin admin=adminRepository.findByUsername(username);
		 if(admin!=null && admin.getPassword().equals(password)) {
			 return admin;
		 }
		throw new RuntimeErrorException(null, "invalid username and password");
				 
	 }
	

}
