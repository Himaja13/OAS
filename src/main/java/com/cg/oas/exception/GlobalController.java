package com.cg.oas.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalController {
	@ExceptionHandler(value = { AddressIdNotFoundException.class})
	  public ResponseEntity<Object> handleOnlineAdmissionException(AddressIdNotFoundException ex, WebRequest request)
	  {
	      String bodyOfResponse = ex.getLocalizedMessage();
		  return new ResponseEntity(bodyOfResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	@ExceptionHandler(value = { ApplicationNotFoundException.class})
	  public ResponseEntity<Object> handleOnlineAdmissionException(ApplicationNotFoundException ex, WebRequest request)
	  {
	      String bodyOfResponse = ex.getLocalizedMessage();
		  return new ResponseEntity(bodyOfResponse, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	   }

}
