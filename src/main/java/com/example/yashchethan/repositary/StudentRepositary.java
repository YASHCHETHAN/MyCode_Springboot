package com.example.yashchethan.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yashchethan.entity.Student;
@Repository
public interface StudentRepositary extends JpaRepository<Student,Integer>{

}
