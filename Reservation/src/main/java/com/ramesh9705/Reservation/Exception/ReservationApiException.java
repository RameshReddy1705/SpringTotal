package com.ramesh9705.Reservation.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ramesh9705.Reservation.Dto.ResponseStructure;
@ControllerAdvice
public class ReservationApiException extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleIdNotFoundException(IdNotFoundException Exception)
	{
		ResponseStructure<String> str= new ResponseStructure<>();
		str.setBody("Id Not Found");
		str.setMessage(Exception.getMessage());
		str.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(str, HttpStatus.NOT_FOUND);	
	}
	
	@ExceptionHandler(InvaildCredentialException.class)
	public ResponseEntity<ResponseStructure<String>> handleInvaildCredentialException(InvaildCredentialException Exception)
	{
		ResponseStructure<String> str= new ResponseStructure<>();
		str.setBody("Invaild Credential Exception");
		str.setMessage(Exception.getMessage());
		str.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>>(str, HttpStatus.NOT_FOUND);	
	}
}
