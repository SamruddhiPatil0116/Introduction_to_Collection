package com.prowings.collection.Vector;

import java.util.Stack;

public class Stackdemo1 {
	public static void main(String[] args) {
		
		
		Stack stack = new Stack();
		stack.push("Samrudhi");
		stack.push(2345.98);
		stack.push("Sonal");
		stack.push("Orange");
		
		System.out.println("Stack :"+stack);
		
		System.out.println("Top element:" +stack.peek());
		
		System.out.println("Position of Orange :" +stack.search("Orange"));
		
		System.out.println("Removed element :"+stack.pop());
		
		System.out.println("Stack is empty :"+stack.empty());
	}
	
	

}
