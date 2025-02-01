package com.finalMock;

public class ShadiCom {
	public static void Submit(int age) throws ShadiException {
		if(age>18)
			System.out.println("you are eligible for shaadi");
		else 
			throw new ShadiException("why so hurry!");
	}
		public static void main(String[] args) {
			try {
				
				Submit(17);
			}
			catch(ShadiException e) {
				System.out.println(e.getMessage());
			}
		}
}
