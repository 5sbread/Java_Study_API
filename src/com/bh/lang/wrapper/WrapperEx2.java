package com.bh.lang.wrapper;

import java.util.Scanner;

public class WrapperEx2 {

	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
								//지역변수 or 멤버변수로 선언 가능
		
		System.out.println("주민번호 입력하세요");
		String jumin = "990816-1234567";
		
		int count = 2;
		int sum = 0;
		for(int i=0; i<jumin.length()-1; i++) {
		//1. substring() : 리턴타입 String
//		String num = jumin.substring(0, 1); //0부터 1미만
//		int n = Integer.parseInt(num);
		
		//2. charAt() : 리턴타입 char
		char ch = jumin.charAt(0);
		//int n = Integer.parseInt(ch+" ");
		
		if(i==6) {
			continue; //주민번호 사이 - 일때는 계산 안하고 건너뛰기
		}//if
		
//		String num = String.valueOf(ch);
//		int n = Integer.parseInt(num);
		
		//↑ 위 두줄을 한줄에 쓴것
		//21라인 num은 한번만 쓰고 안쓸것같기때문에 선언X
		int n = Integer.parseInt(String.valueOf(jumin.charAt(i)));
		sum = sum + n*count;
		count++;
		
		}//for
		
		int check = sum%11;
		
		check = 11-check;
		//if(check==10 || check==1)
		if(check>9) { //두자리수일때
			check = check%10;
		}
		
		//check용 번호
		int checkNum = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));
		
		if(check == checkNum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}
	}
	
}
