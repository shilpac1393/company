package com.company.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.company.model.Employee;
import com.company.repository.employeeRepo;
import com.company.service.employeeService;

@Service
public class employeeServiceImpl implements employeeService {

	@Autowired
	public employeeRepo empRepo;

	@Override
	public void addEmployee(Employee emp) {
		empRepo.save(emp);

	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id);
	}

}
