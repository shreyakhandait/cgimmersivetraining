package com.cg.eis.exceptions;

public class InvalidSalaryException extends RuntimeException {

	public InvalidSalaryException(){
		
	}
	public InvalidSalaryException(String msg) {
		super(msg);
	}

}
