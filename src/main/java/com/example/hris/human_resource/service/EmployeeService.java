package com.example.hris.human_resource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hris.human_resource.entity.Employee;
import com.example.hris.human_resource.reponsitory.EmployeeReponsitory;

@Service
public class EmployeeService {
	@Autowired
	EmployeeReponsitory er;
	
	
	public void addEmp(Employee employee) {
		er.save(employee);
	}
	public List<Employee> listEmployees() {
		return er.findAll();
	}
}
