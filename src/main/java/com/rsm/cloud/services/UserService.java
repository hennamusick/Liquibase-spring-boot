package com.rsm.cloud.services;

import org.springframework.stereotype.Service;

import com.rsm.cloud.models.helpers.UserDTO;

@Service
public class UserService {
	
	/***
	 * Getting two parameters from UserController, then create UserDTO class object for set those parameters. 
	 * And after calculation return the values
	 * 
	 * @author Chathura Hennayaka
	 * @param name
	 * @param age
	 * @return values returning from UserDTO class to UserController
	 * @see UserDTO
	 */
	public UserDTO getUser(String name, int age ) {
		
		UserDTO user = new UserDTO();
		user.setAge(age);
		user.setName(name);
		user.setAge(user.getAge()*2);
		return user;
	}

}
