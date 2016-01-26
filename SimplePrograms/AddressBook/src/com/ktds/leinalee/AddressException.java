package com.ktds.leinalee;

public class AddressException extends RuntimeException {

	public AddressException() {
		super();
	}
	
	public AddressException( String msg ) {
		super(msg);
	}
	
	public AddressException( Throwable t ) {
		super(t);
	}
	
	public AddressException( String msg, Throwable cause ) {
		super(msg, cause);
	}

}
