package com.ktds.leinalee;

public class InvalidNumberException extends RuntimeException{
	
	public InvalidNumberException() {
		super();
	}
	
	public InvalidNumberException( String msg ) {
		super(msg);
	}
	
	public InvalidNumberException( Throwable t ) {
		super(t);
	}
	
	public InvalidNumberException( String msg, Throwable cause ) {
		super(msg, cause);
	}
}
