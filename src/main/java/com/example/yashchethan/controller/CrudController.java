package com.example.yashchethan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.yashchethan.service.Crudservice;

@RestController
public class CrudController {

	@Autowired
	Crudservice crudservice;
	
}
