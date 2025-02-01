package com.List;

import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		//instead of add() method we use push() method in stack.
			//note: we can use add() method also => since stack belongs to vector and vector belongs to list.
		s.push(null);
		s.push(1);
		s.push("sheela");
		System.out.println(s); //[null, 1, sheela]
		System.out.println(s.peek()); //sheela
		System.out.println(s.pop()); //sheela
		System.out.println(s); //[null, 1]
	
		
		
		
	}

}
