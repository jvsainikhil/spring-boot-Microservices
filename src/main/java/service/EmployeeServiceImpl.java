package service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	String ErrorMessage = "The data is not found";
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
	
	@Override
	public Employee getEmployeeById(String id) {
	    for (Employee employee : employees) {
	        if (employee.getEmployeeId().equals(id)) {
	            return employee;
	        }
	    }
	    //return null; // return null if not found
	    throw new RuntimeException(ErrorMessage); 
	}

	/*@Override
	public Employee getEmployeeById(String id) {
    return employees
            .stream()
            .filter(employee -> employee.getEmployeeId().equals(id))
            .findFirst()
            .orElseThrow(() -> new RuntimeException(ErrorMessage));
	}*/
}
