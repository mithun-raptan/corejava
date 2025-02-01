package com.psp;

public class Final  extends Final1{
	public static void main(String[] args) {
		//any class which is declared with the keyword 'final' is called 'final class'
			//example: String class
		//we can't extend 'final' class
		//'final' method can be  inherited ,can be overload, but we can't overridden
		Final1 f = new Final1();
		System.out.println(f.a);
		f.m1();
		f.m1("mithun");
	}

}
