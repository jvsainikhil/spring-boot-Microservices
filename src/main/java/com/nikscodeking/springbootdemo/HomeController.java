package com.nikscodeking.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it will handle the resources and i will send the data response body status codes
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Nikhil";
	}
}



 























