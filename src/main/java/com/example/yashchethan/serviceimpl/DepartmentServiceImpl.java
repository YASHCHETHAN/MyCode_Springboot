package com.example.yashchethan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yashchethan.entity.Department;
import com.example.yashchethan.repositary.DepartmentRepositary;
import com.example.yashchethan.service.DepartmentService;

@Service 
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepositary departmentRepositary;
	
	@Override
	public Department createDepartment(Department department) {
		return departmentRepositary.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {		
		return departmentRepositary.findAll();
	}

	@Override
	public Department getDepartment(int id) {
		return departmentRepositary.findById(id).get();
	}

	@Override
	public Department updateDepartment(int id, Department department) {
		return departmentRepositary.save(department);
	}

	@Override
	public void deleteDepartment(int id) {
		departmentRepositary.deleteById(id);
	}

}
