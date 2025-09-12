package com.example.yashchethan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yashchethan.entity.Student;
import com.example.yashchethan.repositary.StudentRepositary;
import com.example.yashchethan.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepositary studentRepositary;
	
	@Override
	public Student createStudent(Student student) {
		return studentRepositary.save(student);
	}

	@Override
	public Student getStudent(int id) {
		return studentRepositary.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepositary.findAll();
	}

	@Override
	public Student updateStudent(int id, Student student) {
		return studentRepositary.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		studentRepositary.deleteById(id);		
	}

}
