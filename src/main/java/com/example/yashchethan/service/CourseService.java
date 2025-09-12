package com.example.yashchethan.service;

import java.util.List;

import com.example.yashchethan.entity.Course;

public interface CourseService {

	Course createCourse(Course course);

	List<Course> getAllCourses();

	Course getCourse(int id);

	Course updateCourse(int id, Course course);

	void deleteCourse(int id);

}
