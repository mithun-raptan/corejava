package com.php;

import java.util.Scanner;

public class Array2 {
	
	public static int[] returnArray(Scanner s) {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]= s.nextInt();
			
		}
		return arr;
	}

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int array[]=returnArray(sc);
			
			for(int ele: array) {
				System.out.println(ele);
			}
		
	}

}
