package com.cg.oas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oas.repository.IApplicationRepository;
import com.cg.oas.service.IApplicationService;

@RestController
@RequestMapping("/application")
public class ApplicationController {
	@Autowired
	private IApplicationService iApplicationService;
	@Autowired
	private IApplicationRepository iApplicationRepository;

}
