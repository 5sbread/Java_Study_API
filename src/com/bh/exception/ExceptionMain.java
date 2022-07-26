package com.bh.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		System.out.println("메인 실행");
		Test test = new Test();
		
		test.t1();
		System.out.println("메인 종료");
		
		Test2 test2 = new Test2();
		test2.test2();

	}

}
