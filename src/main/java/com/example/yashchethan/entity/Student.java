package com.example.yashchethan.entity;

import java.util.List;

import org.springframework.context.annotation.Profile;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Student.java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer studentId;

 private String name;

 @ManyToOne
 @JoinColumn(name = "department_id")
 private Department department;

 @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
 private Profile profile;

 @OneToMany(mappedBy = "student")
 private List<Enrollment> enrollments;
}
