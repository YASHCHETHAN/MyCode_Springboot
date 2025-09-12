package com.example.yashchethan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.yashchethan.entity.Course;
import com.example.yashchethan.repositary.CourseRepositary;
import com.example.yashchethan.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepositary courseRepositary;

	@Override
	public Course createCourse(Course course) {
		return courseRepositary.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepositary.findAll();
	}

	@Override
	public Course getCourse(int id) {
		return courseRepositary.findById(id).get();
	}

	@Override
	public Course updateCourse(int id, Course course) {
		return courseRepositary.save(course);
	}

	@Override
	public void deleteCourse(int id) {
		courseRepositary.deleteById(id);
	}

}
