package com.ramesh9705.Reservation.Exception;

public class InvaildCredentialException extends RuntimeException
{
	@Override
	public String getMessage() {
		return "invaild phone number and password";
	}

}
