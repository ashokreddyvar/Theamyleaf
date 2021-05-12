package com.example.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ojas.model.Employee1;
import com.example.ojas.service.EmployeeService;

@Controller
public class ControllerEmployee {
	@Autowired
	private EmployeeService empserv;
	@RequestMapping("/get")
	public String regPage(ModelMap map) {
		Employee1 e = new Employee1();
		map.addAttribute("employee", e);
		return "thymleaf";
	}
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee1 employee, ModelMap map) {
		empserv.save(employee);
		map.addAttribute("emp", employee);
		return "information";
	}
	@RequestMapping("/all")
    public String showDates(ModelMap map) {
		map.addAttribute("message","Hello UI");
				List<Employee1> emp1 = empserv.findAll();
		map.addAttribute("list", emp1);
		return "display";
	}
	

}
