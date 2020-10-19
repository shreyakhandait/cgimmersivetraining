package com.cg.eis.exceptions;

public class InvalidDesignationException extends RuntimeException{

	public InvalidDesignationException() {
		
	}
	
	public InvalidDesignationException(String msg) {
		super(msg);
	}
}
