package com.Set;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        // ts.add('c'); // This will throw ClassCastException.
      
        ts.add(20);
        ts.add(10);
        ts.add(30);
        ts.add(10); // Duplicate, will be ignored.
        ts.add(40);
        ts.add(50);
        System.out.println(ts); // Output will be: [10, 20, 30, 40, 50]
        
        //foreach loop
	        for (Object obj : ts) {
				System.out.println(obj);
			}
        
        
        
    }
}
