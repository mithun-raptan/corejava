package com.psp;

public class Final1 {
	
	final int a =10; //it can't be re-initialized but can be inherited
	
	public final void m1() {  //this method can not be overriden
		System.out.println("hello i am final method from Final1 class");
	}

	public final void m1(String s) {  //this method can not be overriden
		System.out.println("hello i am final method from Final1 class"+s);
	}

}
