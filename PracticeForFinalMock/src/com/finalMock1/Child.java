package com.finalMock1;

public class Child implements Parent1,Parent2 {
				public void fun() { //implementation given here
						System.out.println("i resolved the diamond problem");
					}
	public static void main(String[] args) {
		Child c = new Child();
		c.fun();
						
	}

}
