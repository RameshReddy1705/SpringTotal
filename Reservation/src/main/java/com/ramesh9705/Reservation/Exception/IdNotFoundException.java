package com.ramesh9705.Reservation.Exception;

public class IdNotFoundException extends RuntimeException
{
	@Override
	public String getMessage() {
		return "ID not found";
	}

}
