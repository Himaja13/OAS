package com.cg.oas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oas.entities.College;
import com.cg.oas.repository.ICollegeRepository;

@RestController
@RequestMapping("/College")
public class CollegeController {
	@Autowired
	ICollegeRepository iCollegeRepository;
	  
	  @GetMapping(path = "/getall")
		public ResponseEntity<List<College>> getAllBooks() 
	  {
		  List<College> list=iCollegeRepository.findAll();
		  return new ResponseEntity<List<College>>(list, HttpStatus.OK);
	  }
	
}
