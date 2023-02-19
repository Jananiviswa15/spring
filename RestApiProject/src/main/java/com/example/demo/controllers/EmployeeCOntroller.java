package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeCOntroller {

	//no need to add autowired annotation
	//whenever there is only one attr injection is performed without annotation
	//perofermed injection here is CI
	public EmployeeServiceImpl empServ;
	
	
	
	public EmployeeCOntroller(EmployeeServiceImpl empServ) {
		this.empServ = empServ;
	}



	@PostMapping("/saveEmp")
	/*@requestBody --> {
	   "firstName" : "janani",
	   "lastName" : "viswa",
	   "email" : "janani@123"
	}   --> emp*/
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empServ.saveEmp(emp), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/readAllEmp")
	public List<Employee> getAllEmps(){
		return empServ.getEmpsFromDb();
	}
}
