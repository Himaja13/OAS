package com.cg.oas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oas.entities.Course;
import com.cg.oas.repository.ICourseRepository;

@RestController
@RequestMapping("/Course")
public class CoursesController {

	@Autowired
	ICourseRepository iCourseRepository;
	  
	  @GetMapping(path = "/getall")
		public ResponseEntity<List<Course>> getAllBooks() 
	  {
		  List<Course> list=iCourseRepository.findAll();
		  return new ResponseEntity<List<Course>>(list, HttpStatus.OK);
	  }
	
}
