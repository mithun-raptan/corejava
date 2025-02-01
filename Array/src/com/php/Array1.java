package com.php;

public class Array1 {
public static void main(String[] args) {
	
	//one dimensional array
	int arr[] =new int[4];
			//{0,0,0,0};

	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(Math.random()*10);
	}
	
//		traditional for loop
//			for(int i=0;i<arr.length;i++) {
//				
//				System.out.println(arr[i]);
//			}
	
	//enhanced for loop
	for(int ele : arr) {
		System.out.println(ele);
	}
 }
}
