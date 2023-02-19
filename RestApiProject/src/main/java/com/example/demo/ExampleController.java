package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class ExampleController {



	@GetMapping("/tellHi")
	public String sayHi() {
		return "hi everyone";
	}

	//http status  http message converters


	@GetMapping("/returnObject")
	public Employee getEmployee() {
		return new Employee("janani", "viswa", "janani@gmail.com");
	}


	@GetMapping("/returnObjects")
	public List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("janani", "viswa", "janani@gmail.com"));
		empList.add(new Employee("karunya", "siva", "karunya@gmail.com"));
		empList.add(new Employee("jayasree", "s", "jayasree123@gmail.com"));
		empList.add(new Employee("janani123", "viswa123", "janani123@gmail.com"));
		empList.add(new Employee("janani345", "viswa45", "janani45@gmail.com"));
		return empList;
	}
	
	//localhost:8080/janani/viswa
	@GetMapping("{firstName}/{lastName}")
	public Employee getEMpValues(@PathVariable("firstName") String fname,
			@PathVariable("lastName")	String lname) {
		return new Employee(fname, lname);
	}
	
}


