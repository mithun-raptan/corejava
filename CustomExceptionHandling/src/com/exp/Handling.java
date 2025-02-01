package com.exp;

public class Handling {
	
	
	public static void Submit(int age) throws ShadiException {
		if(age>18) {
				System.out.println("Shaadi Mubarak ho");
		}
		else {
			throw new ShadiException("First grow up");
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			Submit(17);
			
		} catch (ShadiException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
