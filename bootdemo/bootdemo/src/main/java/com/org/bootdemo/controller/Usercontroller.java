package com.org.bootdemo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.annotations.ColumnTransformer;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.bootdemo.userdto.Users;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	Map<String, Users> users=new HashMap<>();
	@GetMapping
	public  Collection<Users> getusers() {
		return  users.values();
	}
	@PostMapping
	public String postuser(@RequestBody Users user) {
		Users u=new Users();
		u.setId(user.getId());
		u.setName(user.getName());
		u.setCity(user.getCity());
		users.put(user.getId(), u);
		
		return "saved succussfully";
	}
	
	@PutMapping(path ="/{userid}")
	public String putuser(@PathVariable String userid,@RequestBody Users user) {
		if(users.containsKey(user.getId())) {
			Users u=new Users();
			u.setId(user.getId());
			u.setName(user.getName());
			u.setCity(user.getCity());
			users.put(user.getId(), u);
			return "edited successfully";
		}
		else {
			return "Userid not found";
		}
		
	}
	@DeleteMapping(path ="/{userid}" )
	public String deleteuser(@PathVariable String userid) {
		
		if(users.containsKey(userid)) {
			users.remove(userid);
			return "data deleted";
		}
		else {
			return "data not deleted";
		}
	}
	

}
