package com.example.yashchethan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yashchethan.entity.Enrollment;
import com.example.yashchethan.repositary.EnrollmentRepositary;
import com.example.yashchethan.service.EnrollmentService;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

	@Autowired
	EnrollmentRepositary enrollmentRepositary;
	
	@Override
	public Enrollment createEnrollment(Enrollment enrollment) {
		return enrollmentRepositary.save(enrollment);
	}

	@Override
	public List<Enrollment> getAllEnrollments() {
		return enrollmentRepositary.findAll();
	}

	@Override
	public Enrollment getEnrollment(int id) {
		return enrollmentRepositary.findById(id).get();
	}

	@Override
	public Enrollment updateEnrollment(int id, Enrollment enrollment) {
		return enrollmentRepositary.save(enrollment);
	}

	@Override
	public void deleteEnrollment(int id) {
		enrollmentRepositary.deleteById(id);		
	}

}
