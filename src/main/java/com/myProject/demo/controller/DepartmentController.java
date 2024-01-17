package com.myProject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.demo.entity.Departments;
import com.myProject.demo.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/departments")
@AllArgsConstructor
public class DepartmentController {
	
	@Autowired
	DepartmentService dps;
	
	@PostMapping("save")
	public ResponseEntity<Departments> saveDepartment( @RequestBody Departments department){
		Departments savedDps = dps.saveDepartment(department);
		return new ResponseEntity<>(savedDps , HttpStatus.CREATED);
	}
	
	@GetMapping("get/{id}")
	public  ResponseEntity<Departments> getDepartmentById(@PathVariable long id){
		
		Departments Dps = dps.getDepartmentById(id);
		
		return ResponseEntity.ok(Dps);
		
		
	}
	

}
