package com.finalMock4;

public class Encapsulation {
	private int key;
	public int getter() {
		return key;
	}
	public void setter(int key) {
		this.key = key;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setter(69);
		System.out.println(e.getter());
	}

}
