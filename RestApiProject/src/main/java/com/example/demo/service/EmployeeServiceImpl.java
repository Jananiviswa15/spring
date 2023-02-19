package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmpservInter.EmployeeServ;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeServ{
	
	EmployeeRepo empRepo;
		
	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	public Employee saveEmp(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> getEmpsFromDb() {
		return empRepo.findAll();
	}
}
