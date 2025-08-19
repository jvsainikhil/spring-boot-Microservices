package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/employees") // ------> 1st it going to come here at the class level
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	// For saving the employe in data base
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		// calling service and business layer
		return employeeService.save(employee);
	}

	// we will be getting the all employees
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
