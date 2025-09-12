package com.example.yashchethan.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yashchethan.entity.Enrollment;

@Repository
public interface EnrollmentRepositary extends JpaRepository<Enrollment,Integer>{

}
