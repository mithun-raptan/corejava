package com.Set;

import java.util.LinkedHashSet;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
			LinkedHashSet lhs = new LinkedHashSet();
			lhs.add('c');
			lhs.add("sheela");
			lhs.add(10);
			lhs.add(10);
			lhs.add(20);
			System.out.println(lhs);//[c, sheela, 10, 20]
			
			//foreach loop
				for (Object obj : lhs) {
					System.out.println(obj);
				}
	}

}
