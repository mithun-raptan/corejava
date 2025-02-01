package com.jsp;
import java.lang.String; //no need to import bcuz it is implicitly imported
public class Simple1  { //String is a final class in java, that's why we can't extend string class
	public static void main(String[] args) {
		//we have two ways to create String class object
				//1) using new keyword => stored in 'non constant pool area'
				//2) without using new keyword operator => stored in 'String constant pool area'
//		String s = new String("hello");
//		System.out.println(s.hashCode());
//		String s1=  new String("hello");
//		System.out.println(s1.hashCode());
//		String str = "hello";
//		String str1 = "hello";
//		System.out.println(str.hashCode());
//		System.out.println(str1.hashCode());
		

		//toString() method is overridden in string class
			String s = "hello";
//			System.out.println(s); // implicitly toString() will invoked but instead of
										//'fully qualified path address', value will be print. bcuz
													//toString() method is overridden.
		
		//equals(Object obj) method is also overridden in String class
			//it is used to compared the object address, but here it is used to compare the object value
			
			String s1 = "hiii";
//			System.out.println(s.equals(s1)); //false
			
			
		//to compare the object address in String class we use "==" operator 
			String m1 = "mithun";
			String m2 = "mithun";
//			System.out.println(m1==m2); //true
			
		//some String function
			
				String str= "Hello";
					
			//chatAt()
				System.out.println(str.charAt(0)); //H
			
			//toLowerCase()
				System.out.println(str.toLowerCase()); //hello

		
			//toUpperCase()
				System.out.println(str.toUpperCase()); //HELLO
				
			//contains()
				System.out.println(str.contains("He")); //true
				
			//substring(int beginIndex)
				System.out.println(str.substring(2));//llo
				
			//substring(int beginIndex , int endIndex)
				System.out.println(str.substring(1, 4)); //Hello => 1 index is =>e
																//	4 index i,e(4-1)index is =>l
																//the substring should be "ell"
			//startsWith()
				System.out.println(str.startsWith("h")); //false
				System.out.println(str.startsWith("He"));//true
				
			//endsWith()
				System.out.println(str.endsWith("o")); //true
				
			//concat(String str)
				String m="mithun";
				System.out.println(str.concat(m)); // System.out.println(str.concat("mithun));
			
			//length()
				System.out.println(str.length());//5
				
			//replace(oldCharacter, newCharacter)
				System.out.println(str.replace("H", "j")); //jello
				System.out.println(str); //"Hello"
			
			//toCharArray()
					char str2[]=str.toCharArray(); //['H','e','l','l','o']
					System.out.println(str2[0]); //H
				
				
				
				
	}

}
