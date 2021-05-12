package com.example.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ojas.model.Employee1;
@Repository
public interface EmployeeDao extends JpaRepository<Employee1, Long> {

}
