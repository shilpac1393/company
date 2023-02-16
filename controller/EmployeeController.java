package com.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Employee;
import com.company.service.employeeService;

@RestController
public class EmployeeController {

	@Autowired
	public employeeService empService;

	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee e) {
		empService.addEmployee(e);
		return "Added Successfully";
	}

	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}

	@PostMapping("update/")
	public String updateEmployee(@ModelAttribute Employee e) {
		empService.addEmployee(e);
		return "updated successfully";
	}

	@DeleteMapping("delete{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployee(id);
	}

	@GetMapping("getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}
}
