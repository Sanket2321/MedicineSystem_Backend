package com.MedicineManagement.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedicineManagement.model.User;
import com.MedicineManagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User login(String username, String password) {
		User user = userRepository.findByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		throw new RuntimeErrorException(null, "invalid username and password");
	}

	public List<User> listUsers() {
		return userRepository.findAll();

	}

}
