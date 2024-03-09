package com.example.hris.human_resource.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hris.human_resource.entity.Employee;

public interface EmployeeReponsitory extends JpaRepository<Employee, Integer>{

}
