package com.exp;

public class ShadiException extends Throwable {
	private String msg;
	ShadiException(String msg){
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
	

}
