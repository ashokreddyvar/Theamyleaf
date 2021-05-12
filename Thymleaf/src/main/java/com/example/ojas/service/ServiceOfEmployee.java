package com.example.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ojas.dao.EmployeeDao;
import com.example.ojas.model.Employee1;
@Service
public class ServiceOfEmployee implements EmployeeService {
	@Autowired
	private EmployeeDao empserv;
	public List<Employee1> findAll(){
		return empserv.findAll();
	}

	@Override
	public void save(Employee1 theEmployee) {
		empserv.save(theEmployee);
		
		
	}

	@Override
	public void deleteByid(Long theid) {
		empserv.deleteById(theid);
		
	}

}
