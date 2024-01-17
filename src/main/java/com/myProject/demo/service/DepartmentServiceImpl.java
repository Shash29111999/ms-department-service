package com.myProject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myProject.demo.entity.Departments;
import com.myProject.demo.repository.DepartmentRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired

	private  DepartmentRepository departmentRepo;
	

	@Override
	public Departments saveDepartment(Departments department) {
			return departmentRepo.save(department);
	}

	@Override
	public Departments getDepartmentById(long id) {
		return departmentRepo.findById(id).get();
	}
	
	

}
