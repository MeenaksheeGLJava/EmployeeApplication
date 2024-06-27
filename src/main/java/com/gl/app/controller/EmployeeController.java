package com.gl.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee")
	public String getEmployee() {

		System.out.println("Employee Details In Main Branch");
		System.out.println("Employee Details In Feature1 Branch");

		return "Employee details";
	}

}
