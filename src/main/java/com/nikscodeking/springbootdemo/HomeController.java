package com.nikscodeking.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nikscodeking.springbootdemo.model.User;

// Creating and object and how we can send the objects back, New end point to handle objects 
// It will handle the resources and i will send the data response body status codes
@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Nikhil";
	}

	// @RequestMapping(value = "/user", method = RequestMethod.) // ---> This get
	// mapping we know but we need to define
	@GetMapping("/user") // Much easier to see
	// userDetails - Method ---> We have set the details
	public User userDetails() {
		User user = new User();
		user.setId("0");
		user.setName("Nikhil");
		user.setEmailid("jvsainikhil@gmail.com");
		return user;
	}

	@GetMapping("/{id}/{id1}/{id2}/{id3}")
	public String pathvariable(@PathVariable("id") String name, @PathVariable("id1") String name1, @PathVariable("id2") String name2, @PathVariable("id3") String name3) {
		return "The path variable is: Name is: " + name + " : " + name1 + " : " + name2 + " : " + name3;
	}
	
	@GetMapping("/reqparam")
	public String requestparam(@RequestParam String name, @RequestParam(name= "email", required = false, defaultValue= "Please enter value") String emailId) {
		return "Your name is: " + name + "\nEmailId: " + emailId;
	}
}
