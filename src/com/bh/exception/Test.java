package com.bh.exception;

import java.util.Random;

public class Test {
	
	public void t4() throws Exception {
		//유치원생 프로그램
		//0-99
		int num = 48;
		int num2 = 82;
		int num3 = num+num2;
		int num4 = num - num2;
		
		if(num3>99) {
			throw new MyException();
		}
		if(num4<0) {
			throw new MyException("그게 머야");
		}
		
	}

//=====================================
	public void t3() throws NullPointerException{
		
		String str = null;
	}
	
//======================================	
	public void t1() {
		
		String str = null;
		
		Random random = new Random();
		if(random.nextInt(10)%2==0) {
			str = "10";
			System.out.println("t1 메서드 실행");
		}
		
		int num = Integer.parseInt(str);
		
		//Exception 발생시 여기서부터↓ 종료
		//if문이 true일 때 -> 컴파일 됨
		//if문이 false일 때 -> Exception
		System.out.println(str.toString());
		System.out.println("t1 메서드 종료");
		
		new NullPointerException();
		//Exception 발생시 Java에서 예외객체 생성
		
//===============================================		
		//Compile error 컴파일 에러
		// - 문법 오류 등 컴파일 진행 X, 실행 X
		// - Unresolved ~~
		
		//Exception 예외
		// - *실행* 중 발생하는 에러
		// - 예외가 발생하면 그 즉시 프로그램 강제 종료
		
	}
	
}
