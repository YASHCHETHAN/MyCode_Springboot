package com.example.yashchethan.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Department.java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer departmentId;
 
 private String name;

 @OneToMany(mappedBy = "department")
 private List<Student> students;
}
