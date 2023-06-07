package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional
	public Department get(int id) {

		return departmentRepository.findById(id).get();
	}

	@Transactional
	public void save(Department department) {
		
		departmentRepository.save(department);
		
	}
	
	@Transactional
	public List<Department> getDepartmentHavingEmployeeGreaterThan1() {
		
		return departmentRepository.getDepartmentHavingEmployeeGreaterThan1();
		
	}
	
}
