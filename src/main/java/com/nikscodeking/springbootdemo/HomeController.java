package com.nikscodeking.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Nikhil";
		
	}
}



























