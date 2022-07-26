package com.bh.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음. abc.txt / jpg.word
		//파일이 이미지파일인지 아닌지 구별
		//확장자 jpg, png, gif, jpeg
		Scanner sc = new Scanner(System.in);
		
		String [] files = {"jpg", "png", "gif", "jpeg"}; //확장자를 배열로 묶음
		
		boolean check = true;
		
		while(check) {
			System.out.println();
			System.out.println("이미지 파일 구별");
			System.out.println("1.구별 진행 | 2.종료");
			int i = sc.nextInt();
				
			if(i==1) {
				System.out.println("파일명을 입력하세요.");
				String imgName = sc.next();
				
				int index = imgName.lastIndexOf("."); //뒤에서부터 .을 찾아서 인덱스 번호 저장
				
				//imgName.substring(index); //.확장자의 값으로 나옴
				imgName = imgName.substring(index+1); //.빼고 확장자만 값으로 나옴
				
				String result = "이미지 파일이 아닙니다.";
				for(int e=0; e<files.length; e++) {
					if(imgName.equals(files[e])) {
					result = "이미지 파일입니다.";
					break; //확장자 중 하나면 바로 구문 종료
					}
				}
				System.out.println(result);
				
				//이렇게 써도 가능, 코드가 길어서 별로
				//if(imgName.equals("jpg") || imgName.equals("png") || imgName.equals("gif") || imgName.equals("jpeg"));
				
			}else {
				System.out.println("종료합니다.");
				check =! check;
			}//if	
		}//while
		
	}//public
	
	
	public void studyIndexOfEx1() {
		String names = "iu, suji, choa, hani";
		//names에는 몇개의 쉼표가 있는가?
		//총 몇명?
		
		boolean check = true;
		int count = 0; //쉼표의 갯수를 담을 변수
		int index=0; //쉼표의 인덱스 번호 저장
		
		while(check) {
			index = names.indexOf(",", index);
			
			if(index==1) {
				break;
			}else {
				count++;
				index++;
			}
		}//while 끝
		
		System.out.println("쉼표 갯수 : "+count);
		System.out.println("인원 수 : "+(count+1));
	}
	
	
	
	
	public void studyIndexof() {		
		String str = "Hello Java";
		
		int index = str.indexOf("a"); //ch -> char타입
		//index : 해당 값이 몇번 인덱스에 있는가?
		//0번 인덱스부터 찾음
		//못찾으면 값은 -1
	//	int index = str.indexOf("ll");
		//-> ll이 시작하는 2번이 값 (Hellow world)
		
		//오버라이딩 | 오버로딩의 차이는?
		
		String replace = str.replace('l','w');
		System.out.println(replace);
		System.out.println(str);
		
		str = "Google 입사 동기는... 우왕~ Google~~";
		System.out.println(str);
		
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2 = " hi ";
		System.out.println(str.equals(str2)); //false
		
		str2 = str2.trim(); //앞뒤 공백 삭제
		System.out.println(str.equals(str2)); //true
		
		str2 = str2.replace(" ", ""); //글자 사이 공백도 삭제
		
	}
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업 (parsing)
		String member = "iu/1234"; //아이디와 비번을 문자열로 받음
		String pw = member.substring(3); //왼쪽에서 3번쨰부터 끝까지 잘라오기
		String id = member.substring(0, 2); //새로운 문자열 선언 후 기존 문자열에서 원하는 만큼 잘라오기
									//0번부터 2번 인덱스 *미만*까지 가져오기
									//0번부터 2개
		System.out.println(id);
		System.out.println(pw);
		
	}
	
	
	

}
