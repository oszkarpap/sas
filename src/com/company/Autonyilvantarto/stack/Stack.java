package com.company.Autonyilvantarto.stack;

import com.company.Autonyilvantarto.stack.exceptions.StackEmptyException;
import com.company.Autonyilvantarto.stack.exceptions.StackFullException;


public class Stack<TYPE> {

	//LIFO = last in first out
	private Object[] array;
	private int top=0;
	
	public Stack(){
		array=new Object[10];
	}
	
	public Stack(int max){
		array=new Object[max];
	}
	
	public boolean isEmpty(){
		return top==0;
	}
	
	public boolean isFull(){
		return top==array.length;
	}
	
	public void push(TYPE obj) throws StackFullException {
		if(isFull()) throw new StackFullException();
		array[top]=obj;
		top++;
		//array[top++]=obj;
	}
	
	public TYPE pop() throws StackEmptyException {
		if(isEmpty()) throw new StackEmptyException();
		return (TYPE)array[--top];
	}
	
	public int size(){
		return top;
	}
}
