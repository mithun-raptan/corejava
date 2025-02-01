package com.exp1;

public class Vote {
	
	public static void votestatus(int age) throws VoteHandle {
		if(age<18) {
			throw new VoteHandle("you are not eligible for vote");
		}
		else {
			System.out.println("you are eligible for vote");
		}
	}
	public static void main(String[] args) {
		try {
			votestatus(17);
			
		} catch (VoteHandle e) {
			System.out.println(e.m);
			
		}
	}

}
