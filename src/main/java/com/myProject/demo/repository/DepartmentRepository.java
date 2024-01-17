package com.myProject.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myProject.demo.entity.Departments;

@Service
public interface DepartmentRepository extends JpaRepository<Departments, Long> {

}
