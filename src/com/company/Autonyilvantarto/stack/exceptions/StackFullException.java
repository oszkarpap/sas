package com.company.Autonyilvantarto.stack.exceptions;

public class StackFullException extends StackException {

	public StackFullException(){
		super("A Stack tele van, nem lehet push-olni.");
	}
}
