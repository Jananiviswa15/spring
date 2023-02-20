package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;


//whenevr i interact with db // @REPOSITORY
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

}
