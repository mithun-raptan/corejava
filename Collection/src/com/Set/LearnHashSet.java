package com.Set;

import java.util.HashSet;

public class LearnHashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add('c');
		hs.add("sheela");
		hs.add(10);
		hs.add(10);
		hs.add(20);
		System.out.println(hs); //[c, 20, 10, sheela]
		
		//foreach loop
		for (Object ele : hs) {
			System.out.println(ele);
		}
		
		
	}

}
