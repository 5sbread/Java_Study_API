package com.bh.exception;

public class MyException extends Exception {
					//추상메서드가 아니라 오버라이딩X
	
	public MyException() {
		super("몰라요 산수 포기");
	}
	
	
	public MyException(String message) {
		super(message);
	}
}
