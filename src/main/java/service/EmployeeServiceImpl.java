package service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employees = new ArrayList<>();

	@Override
	public Employee save(Employee employee) {

		if (employee.getEmailId() == null || employee.getEmailId().isEmpty()) {
			employee.setEmailId(UUID.randomUUID().toString());
		}
		employees.add(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}
}
