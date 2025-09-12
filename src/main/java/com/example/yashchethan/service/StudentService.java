package com.example.yashchethan.service;

import java.util.List;

import com.example.yashchethan.entity.Student;

public interface StudentService {

	Student createStudent(Student student);

	Student getStudent(int id);

	List<Student> getAllStudents();

	Student updateStudent(int id, Student student);

	void deleteStudent(int id);

}
