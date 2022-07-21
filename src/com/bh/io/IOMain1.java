package com.bh.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		//키보드로부터 글자를 입력받는 순서 작성
		//byte를 모아서 글자로 만들기
		//글자를 모아서 문자배열(문자열)로 만들기
		
		InputStream is = System.in;
		//keyborad는 표준입력기 | byte 처리
		
		InputStreamReader ir = new InputStreamReader(is);
		//한글자만 처리 가능
		
		BufferedReader br = new BufferedReader(ir);
		//보조스트림 | 문자열로 만들기
		
		//String msg = br.readLine();
		//이렇게 쓰면 오류나서 해결 한게 아래
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//buffer를 읽어오기
		
		
	}

}
