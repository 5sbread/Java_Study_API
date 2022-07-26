package com.bh.lang.string;

public class StringMain1 {

	public static void main(String[] args) {
		
		//두 방식으로 선언 가능
		String str1 = "bh"; //bh = 리터럴(상수)(변수에 넣는 데이터)
		String str2 = "bh";
	//상수 영역에 bh라는 데이터가 이미 있기때문에 새로 만들지 않고 기존의 데이터를 집어넣음
	//-> 동일한 주소를 가지게 됨
		
		String str3 = new String("bh");
	//new 선언자 -> heap 영역에 새롭게 만듦
	//-> 주소 다름
		String str4 = new String("bh");
		
		System.out.println(str1 == str2); //true /주소 비교
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //false
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("===========================");
		System.out.println(str1.equals(str2)); //true /내용비교
		System.out.println(str1.equals(str3)); //true
		
		
		StringStudy ss = new StringStudy();
		
//----------------------------------------		
		StringStudy2 s2 = new StringStudy2();
		//s2.studyIndexOfEx1();
		//s2.studySubString(); 다음 메소드 실행하려고 주석처리해둠
		s2.ex2();
		
//----------------------------------------
		StringStudy3 s3 = new StringStudy3();
		s3.studySplit3();
	}

}
