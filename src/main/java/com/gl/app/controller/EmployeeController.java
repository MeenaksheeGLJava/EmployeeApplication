package com.gl.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployee() {
		System.out.println("Employee Details In Main Branch");
		return "Employee details";
	}

}
