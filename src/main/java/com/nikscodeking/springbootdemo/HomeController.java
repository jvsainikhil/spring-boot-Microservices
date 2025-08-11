package com.nikscodeking.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nikscodeking.springbootdemo.model.User;


//Creating and object and how we can send the objects back, New end point to handle objects 

@RestController // it will handle the resources and i will send the data response body status codes
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Nikhil";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET) // ---> This get mapping we know but we need to define 
	//userDetails - Method ---> We have set the details
	public User userDetails() {
		User user =  new User();
		user.setId("0");
		user.setName("Nikhil"); 
		user.setEmailid("jvsainikhil@gmail.com");
		return user;
	}
}



 























