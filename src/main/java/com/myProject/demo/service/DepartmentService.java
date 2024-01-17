package com.myProject.demo.service;

import com.myProject.demo.entity.Departments;

public interface DepartmentService {
	
	Departments saveDepartment(Departments department );
	
	Departments getDepartmentById(long id);
	

}
