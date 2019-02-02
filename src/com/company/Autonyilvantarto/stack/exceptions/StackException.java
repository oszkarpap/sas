package com.company.Autonyilvantarto.stack.exceptions;

public class StackException extends RuntimeException {

	public StackException(){
		super("A Stacken hibás művelet történt.");
	}
	
	
	public StackException(String msg){
		super(msg);
	}
}
