package com.springbooot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge=3600)
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {

		return employeeDao.findAll();

	}
	
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {

		return employeeDao.getOne(id);

	}

	@PostMapping("/saveEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeDao.save(employee);
	}

	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeDao.save(employee);
	}

	@DeleteMapping("deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeDao.deleteById(id);
	}
}
