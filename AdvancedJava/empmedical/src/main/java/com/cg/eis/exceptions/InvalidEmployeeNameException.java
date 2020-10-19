package com.cg.eis.exceptions;

public class InvalidEmployeeNameException extends RuntimeException{
	
	public InvalidEmployeeNameException() {		
	}
	
	public InvalidEmployeeNameException(String msg) {
		super(msg);
	}
	
	

}
