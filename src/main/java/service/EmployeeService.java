package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	List<Employee> getAllEmployees();
}
