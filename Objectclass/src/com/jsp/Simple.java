package com.jsp;
 import java.lang.Object;

public class Simple extends Object {
	
	//overriden toSting() method
	
			//	public String toString() { 
			//		return "hello world";
			//	}
	
	//overriden hashCode() method
		
			//	public int hashCode() {
			//			return 10;
			//	}
	
	//overriden equals(object obj) method
			
			// public boolean equals(Object obj) {
			//			return true;
			// }
		
	
	public static void main(String[] args) {
			
		Simple s = new Simple();
		
			//toString() method => implicitly it will invoked, explicitly also we can invoked
				System.out.println("implicitly invoked toString() method => "+s); //implicitly toString() method gets invoked
				System.out.println("explictly invoked toString() method => "+s.toString()); // explicitly i am invoking toSting() method
			
			//hashCode()=> it should be invoked explicitly => generate random unique integer number
				System.out.println("the hashCode number is => "+s.hashCode());
			
			//equals(object obj)=> it should be invoked explicitly => return boolean(true/false)
	
		Simple s1 = new Simple();
				System.out.println("the equals(object obj) return is => "+s.equals(s1));
				
	}

}
