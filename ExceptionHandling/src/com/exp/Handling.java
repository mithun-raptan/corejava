package com.exp;

public class Handling {
	void m1() throws Exception{
		System.out.println(4/0);
	}
	void m2() {
		try {
			m1();
			
		} catch (Exception e) {
			
		}
	}

	public static void main(String[] args){
		Handling h= new Handling();
		h.m2();
		
//		try {
//			h.m2();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
}
}
