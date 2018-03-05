package com.verifix.exceptions;

public class EmptyRecordSetException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EmptyRecordSetException() {
		super();
	}

	public EmptyRecordSetException(String message) {
		super(message);
	}
	
	
}
