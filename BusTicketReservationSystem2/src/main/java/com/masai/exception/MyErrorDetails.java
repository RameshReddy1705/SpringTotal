//package com.masai.exception;
//
//import java.time.LocalDateTime;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//@Data
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//public class MyErrorDetails {
//
//	private LocalDateTime timestamp;
//	
//	private String message;
//	
//	private String details;
//
//	public LocalDateTime getTimestamp() {
//		return timestamp;
//	}
//
//	public void setTimestamp(LocalDateTime timestamp) {
//		this.timestamp = timestamp;
//	}
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public String getDetails() {
//		return details;
//	}
//
//	public void setDetails(String details) {
//		this.details = details;
//	}
//
//	public MyErrorDetails(LocalDateTime timestamp, String message, String details) {
//		super();
//		this.timestamp = timestamp;
//		this.message = message;
//		this.details = details;
//	}
//
//	public MyErrorDetails() {
//		super();
//	}
//
//	@Override
//	public String toString() {
//		return "MyErrorDetails [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
//	}
//	
//	
//
//}
