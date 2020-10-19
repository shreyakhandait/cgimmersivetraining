package com.cg.eis.exceptions;

public class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
