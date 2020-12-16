package com.capgemini.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.dto.ResponseDTO;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;

@ControllerAdvice
public class AddressBookExceptionHandler {

	@ExceptionHandler(ValueInstantiationException.class)
	public ResponseEntity<ResponseDTO> handleInvalidValueException(ValueInstantiationException exception) {
		ResponseDTO response = new ResponseDTO("Exception While Processing Http Request !", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(AddressBookException.class)
	public ResponseEntity<ResponseDTO> handleEmployeeNotFoundException(AddressBookException exception) {
		ResponseDTO response = new ResponseDTO("Exception While Processing Http Request !", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.BAD_REQUEST);
	}

}