package com.MedicineManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedicineManagement.model.User;
import com.MedicineManagement.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
	
  @Autowired
  private UserService userService;
  
  @PostMapping("/login")
  public User user(String username,String password) {
	  return userService.login(username, password);
  }
  @GetMapping("/all")
    public List<User> listUsers(){
	  return userService.listUsers();
  }
  
	
	

}
