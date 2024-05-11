package org.docNmeds.ramesh.docNmedsBackEndRestApi.Controller;

public class LogInResponse
{
	String message;
	boolean status;
	public LogInResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public LogInResponse() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoginMessage [message=" + message + ", status=" + status + "]";
	}
}
