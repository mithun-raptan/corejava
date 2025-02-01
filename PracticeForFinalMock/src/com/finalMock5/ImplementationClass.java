package com.finalMock5;

public class ImplementationClass implements Abstraction100Parcent {
			public void Disco() {
				System.out.println("i am giving the implementation of  the Interface");
			}
			
			public static void main(String[] args) {
				ImplementationClass ic=new ImplementationClass();
				ic.Disco();
			}
}
