package com.shadab.ds.stack.javastack;
/**
 * 
 */
/**
 * @author mshadab
 *
 */

import java.util.Stack;

public class JavaStacktest {
	
	static Stack<String> stack = new Stack<String>();
	
	public static void main(String[] args) {
		stack.setSize(1);
		System.out.println(stack.isEmpty());
		stack.push("data-1");
		stack.push("data-2");
		stack.push("data-3");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.get(2));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}