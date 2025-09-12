package com.example.yashchethan.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yashchethan.entity.Course;

@Repository
public interface CourseRepositary extends JpaRepository<Course,Integer>{

}
