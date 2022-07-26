package com.bh.exception;

import java.util.Scanner;

public class Test2 {
	
		public void test2() {
		String [] str = {"10", "five", "3.14"};
		
		
		for(String s:str) {
			try {
				int num = Integer.parseInt(s);

				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요.");
				int n = sc.nextInt();
				
				System.out.println(num);
			}catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외처리");
			}catch(ArithmeticException e) {
				System.out.println("수학 오류 해결 ");
			}catch(Exception e) {
				e.printStackTrace();
			}catch(Throwable e) {
				
			}
		}//for
		
		
	}
}
