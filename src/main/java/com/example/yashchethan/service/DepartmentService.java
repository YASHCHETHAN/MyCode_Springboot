package com.example.yashchethan.service;

import java.util.List;

import com.example.yashchethan.entity.Department;

public interface DepartmentService {

	Department createDepartment(Department department);

	List<Department> getAllDepartments();

	Department getDepartment(int id);

	Department updateDepartment(int id, Department department);

	void deleteDepartment(int id);

}
