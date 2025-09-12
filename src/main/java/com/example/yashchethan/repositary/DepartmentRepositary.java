package com.example.yashchethan.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yashchethan.entity.Department;

@Repository
public interface DepartmentRepositary extends JpaRepository<Department,Integer>{

}
