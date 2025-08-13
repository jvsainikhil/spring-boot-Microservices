package com.nikscodeking.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikscodeking.springbootdemo.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee emp() {
		Employee employee = new Employee();
		employee.setFirstName("Nikhil");
		employee.setLastName("Kumar");
		employee.setEmployeeId("E101");
		employee.setEmailId("nikhil@example.com");
		employee.setDepartment("IT");
		return employee; // Spring will convert this object to JSON automatically
	}
}