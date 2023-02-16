package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.model.Employee;

@Repository
public interface employeeRepo extends JpaRepository<Employee, Integer> {

}
