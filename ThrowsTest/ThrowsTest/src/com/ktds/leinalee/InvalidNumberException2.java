package com.ktds.leinalee;

public class InvalidNumberException2 extends Exception {
	
	public InvalidNumberException2() {
		super();
	}
	
	public InvalidNumberException2( String msg ) {
		super(msg);
	}
	
	public InvalidNumberException2( Throwable t ) {
		super(t);
	}
	
	public InvalidNumberException2( String msg, Throwable cause ) {
		super(msg, cause);
	}
}