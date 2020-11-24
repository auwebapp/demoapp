package com.springmicoservices.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmicoservices.department.entity.Department;
import com.springmicoservices.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository detpartmentRepository;

	public Department saveDepartment(Department department) {
		return detpartmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		return detpartmentRepository.findDepartmentByDepartmentId(departmentId);
	}
}
