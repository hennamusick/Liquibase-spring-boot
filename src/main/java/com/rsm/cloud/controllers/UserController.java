package com.rsm.cloud.controllers;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rsm.cloud.services.UserService;

@RequestMapping(value = "/user/")
@RestController
public class UserController {

	@Inject
	private UserService userService;
	
	/***
	 * Getting two parameters as name and age,
	 * convert to the JSON object and then parsing value to getUser() of UserService Class
	 * 
	 * @author Chathura Hennayaka
	 * @param age, name 
	 * @return Convert name and age values to JSON objects and send values to UserService class
	 * @see UserService
	 */
	
	@RequestMapping(value = "world", method = RequestMethod.GET)
	public ResponseEntity<?> valueParsing(@RequestParam("name") String name,@RequestParam("age") int age) {
	 return ResponseEntity.ok(userService.getUser(name, age));
	}// End valueParsing()

}
