package com.company.service;

import java.util.List;
import java.util.Optional;

import com.company.model.Employee;

public interface employeeService {

	public void addEmployee(Employee emp);

	public List<Employee> getAllEmployee();

	public void deleteEmployee(Integer id);

	public Optional<Employee> getEmployeeById(Integer id);

}
