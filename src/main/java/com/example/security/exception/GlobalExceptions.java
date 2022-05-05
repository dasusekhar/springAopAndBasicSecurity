package com.example.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.security.error.BusinessException;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptions  extends  ResponseEntityExceptionHandler{
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleEmptyInput(BusinessException exception)
	{
		return new ResponseEntity<>("input field is empty please write ",HttpStatus.BAD_REQUEST);
	}
	

}
