package com.tutorial.employeemanagmentbackend.repository;

import com.tutorial.employeemanagmentbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
