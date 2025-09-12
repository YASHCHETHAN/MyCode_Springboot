package com.example.yashchethan.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.yashchethan.entity.Profile;

@Repository
public interface ProfileRepositary extends JpaRepository<Profile,Integer>{

}
