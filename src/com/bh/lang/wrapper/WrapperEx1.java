package com.bh.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {
	
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 입력");
		//String jumin = sc.next();
		String jumin = "990816-2234567";
		//this.check1(jumin);
		//this.age(jumin);
		this.season(jumin);
	}
	
//---------------------------------------------	
	
	private void check1(String jumin) {
		//1. 남자 여자 판단
		char ch = jumin.charAt(7);
		if(ch=='1' || ch=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	

	private void age(String jumin) {
		String year = jumin.substring(0, 2); //년도
		char ch = jumin.charAt(7); //1900,2000
		
		String cen = "20";
		if(ch=='1' || ch=='2') { //char타입은 == 연산 가능
			cen="19";
		}	
		
		year = cen+year;
		//System.out.println(year); //year값이 정확하게 나왔는지 확인
		
		int y = Integer.parseInt(year);
		//System.out.println(y); //확인
		
		y = 2022 - y +1;
		
		
		System.out.println("AGE : "+y);
	}
	
	
	private void season(String jumin) {
		
		jumin = jumin.substring(2, 4); //4미만
		//System.out.println(jumin); //확인
		
		int month=Integer.parseInt(jumin);
		System.out.println(month);
		
		if(month>2 && month<6) {
			System.out.println("봄");
		}else if(month>5 && month> 9) {
			System.out.println("여름");
		}else if(month>8 && month>12) {
			System.out.println("가을");
		}else{
			System.out.println("겨울");
		}
		
	}
	
}
