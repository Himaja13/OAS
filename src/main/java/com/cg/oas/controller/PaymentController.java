package com.cg.oas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oas.entities.Payment;
import com.cg.oas.repository.IPaymentRepository;

@RestController
@RequestMapping("/Payment")
public class PaymentController {

	@Autowired
	IPaymentRepository iPaymentRepository;
	  
	  @GetMapping(path = "/getall")
		public ResponseEntity<List<Payment>> getAllBooks() 
	  {
		  List<Payment> list=iPaymentRepository.findAll();
		  return new ResponseEntity<List<Payment>>(list, HttpStatus.OK);
	  }
}
