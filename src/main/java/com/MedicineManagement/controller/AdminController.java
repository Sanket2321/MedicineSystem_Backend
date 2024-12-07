package com.MedicineManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.Admin;
import com.MedicineManagement.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/login")
	public Admin login(@RequestParam String username,@RequestParam String password) {
		return adminService.login(username, password);
	}
	

}
