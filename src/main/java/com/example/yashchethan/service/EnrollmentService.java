package com.example.yashchethan.service;

import java.util.List;

import com.example.yashchethan.entity.Enrollment;

public interface EnrollmentService {

	Enrollment createEnrollment(Enrollment enrollment);

	List<Enrollment> getAllEnrollments();

	Enrollment getEnrollment(int id);

	Enrollment updateEnrollment(int id, Enrollment enrollment);

	void deleteEnrollment(int id);

}
