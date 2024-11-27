package com.springboot001.springtask.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot001.springtask.entity.Users;
import com.springboot001.springtask.payload.UserDto;
import com.springboot001.springtask.repository.UserRepository;
import com.springboot001.springtask.service.UserService;
@Service
public class UserServiceimpl implements UserService {
	@Autowired
    private UserRepository userRepository;
	@Override
	public UserDto CreateUser(UserDto userdto) {
		//userDto is not an entity of user
		//userRepository.save(userdto);
		
		 Users user=userDtoToEntity(userdto);
		 Users saveduser=userRepository.save(user);
		return entityToUserDto(saveduser);
	}
	
	private Users userDtoToEntity(UserDto userdto) {
		Users user=new Users();
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		return user;
	}
	
	private UserDto entityToUserDto(Users saveduser) {
		UserDto userdto=new UserDto();
		userdto.setId(saveduser.getId());
		userdto.setEmail(saveduser.getEmail());
		userdto.setPassword(saveduser.getPassword());
		userdto.setName(saveduser.getName());
		
		return userdto;
	}

}
