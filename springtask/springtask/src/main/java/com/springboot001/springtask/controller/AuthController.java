package com.springboot001.springtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot001.springtask.entity.Users;
import com.springboot001.springtask.payload.UserDto;
import com.springboot001.springtask.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private UserService userservice;
	//post store the user in Database
	@PostMapping("/register")
	public  ResponseEntity<UserDto> CreateUser(@RequestBody UserDto userdto) {
		return new ResponseEntity<UserDto>(userservice.CreateUser(userdto), HttpStatus.CREATED);
	}

}
