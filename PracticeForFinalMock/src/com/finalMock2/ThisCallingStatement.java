package com.finalMock2;

public class ThisCallingStatement {
	
				
	
	
	public ThisCallingStatement(double d) {
		System.out.println(d);
	}
	public ThisCallingStatement(String s) {
		this(6.7);
	}
	public ThisCallingStatement(int i) {
		this("Abc");
	}
	
	public static void main(String[] args) {
		new ThisCallingStatement(69);
	}
}
