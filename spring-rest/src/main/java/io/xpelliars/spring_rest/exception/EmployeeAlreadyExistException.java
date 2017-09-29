package io.xpelliars.spring_rest.exception;

public class EmployeeAlreadyExistException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 991390059337033673L;

	public EmployeeAlreadyExistException (String message) {
		super(message);
	}
	
	public EmployeeAlreadyExistException (String message, Throwable cause) {
		super(message, cause);
	}
}
