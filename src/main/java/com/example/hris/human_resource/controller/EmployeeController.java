package com.example.hris.human_resource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hris.human_resource.entity.Employee;
import com.example.hris.human_resource.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/employee")
	public String getEmployee(Model model) {
		List<Employee> employees = employeeService.listEmployees();
		model.addAttribute("listEmp", employees);
		return "Employee/employee.html";
	}
	
	@GetMapping("/employee/add")
	public String getAddEmp() {
		return "Employee/add-employee.html";
	}
	
	@PostMapping("/employee/add")
	public String postAddEmp(@ModelAttribute Employee employee) {
		employeeService.addEmp(employee);
		return "redirect:/employee";
	}
}
