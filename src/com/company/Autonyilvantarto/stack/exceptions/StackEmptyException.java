package com.company.Autonyilvantarto.stack.exceptions;

public class StackEmptyException extends StackException {

	public StackEmptyException(){
		super("A Stack űres, nem lehet pop-olni.");
	}
}
