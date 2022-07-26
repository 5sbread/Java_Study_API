package com.bh.lang;

import java.util.Scanner;
//클래스명 중복 가능
//패키지명 중복 불가능 -> 같은 클래스 다른 기능인 경우가 있음 *패키지명 잘 보고 사용하기

public class LangMain {

	public static void main(String[] args) {
		String name = "iu";
		//같은 패키지 안에 String 클래스가 없는 데 사용할 수 있는 이유
		//-> 기본제공하는 java.base/java.lang 안에 있기 때문
		//-> 별다른 import 없이 사용 가능
		
		Scanner sc;

		Object obj = new Object();
		//java.lang 에 있는 것
		String str = obj.toString();
		Member member = new Member();
		
		System.out.println(str);
		
		str = member.toString();
		System.out.println(str);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		
		Car car2 = new Car();
		
		obj = member;
		//모든 클래스의 부모는 object
		//모든 클래스는 object 타입
		
		//MemberClient / Car / String / Object를 같은 배열에 저장하는 법 -> Object 타입 배열 만들기
		
		boolean check = car.equals(car2); //car의 주소값과 car2의 주소값이 같은가?
		System.out.println(check); //다름
		
		//오버라이딩하면 아래 두개 같은 값이 됨
		System.out.println(car.toString());
		System.out.println(car);
		
		String nm = "sb";
		System.out.println(name);		
		
		
		
	}

}
