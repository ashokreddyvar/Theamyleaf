package com.example.ojas.service;


import java.util.List;

import com.example.ojas.model.Employee1;


public interface  EmployeeService {
	List<Employee1> findAll();
	public void  save(Employee1 theEmployee);
	public void deleteByid(Long theid);

}
