package com.List;

import java.util.ArrayList;

public class List {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//add(object obj)
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(null);
		al.add("sheela");
		al.add('c');
		System.out.println(al); //[10, 20, 30, null, sheela, c]
		
		//add(int index, object obj)
		al.add(2, 5000);
		System.out.println(al); //[10, 20, 5000, 30, null, sheela, c]
		
		//addAll(Collection c)
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al.addAll(al1);
		System.out.println(al); //[10, 20, 5000, 30, null, sheela, c, 100, 200, 300]
		
		//addAll(int index, Collection c)
		al.addAll(0, al1);
		System.out.println(al);//[100, 200, 300, 10, 20, 5000, 30, null, sheela, c, 100, 200, 300]
		
		//remove(int index)
		al.remove(2); //at 2 index => 300 is there
		System.out.println(al); //[100, 200, 10, 20, 5000, 30, null, sheela, c, 100, 200, 300]
		
		//remove(object obj)
		Object obj = 5000;
		al.remove(obj); //5000 should be deleted from the list
		System.out.println(al); //[100, 200, 10, 20, 30, null, sheela, c, 100, 200, 300]
		
		
		//removeAll(Collection c)
		al.removeAll(al1); //al->[100, 200, 300] ... 
		System.out.println(al); //[10, 20, 30, null, sheela, c]
		
		//retainAll(Collection c)
		System.out.println(al); //[10, 20, 30, null, sheela, c]
		ArrayList al2 = new ArrayList();
		al2.add(10); 
		al2.add(20); 
		al2.add('d');
		System.out.println(al2); //[10, 20, d]
		al.retainAll(al2);
		System.out.println(al); //[10, 20]
		
		//size()
		//al->[10,20]
		System.out.println(al.size()); //2
		
		//get(int index)
		System.out.println(al.get(0));//10
		
		//contains(
		//al->[10,20]
		Object obj1 =10;
		System.out.println(al.contains(obj1));
		
		
		
		
	}
}
