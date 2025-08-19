package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {

	Employee getEmployeeById(String id);
	Employee save(Employee employee);
	List<Employee> getAllEmployees();
}
