package com.bh.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client2 {

	//getFood
	//서버 접속 후 메세지 받음
	// 1. 점심 메뉴
	// 2. 저녁 메뉴
	// 3. 종료
	// 숫자 입력받은 후 서버로 전송
	
	Scanner sc = new Scanner(System.in);
	
	public void getFood() throws IOException {
		Socket socket = new Socket("192.168.7.15", 8282);
		
		OutputStream os = socket.getOutputStream();//0,1을 처리
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자 한글자 처리
		BufferedWriter bw = new BufferedWriter(ow); //문자열 처리
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		boolean check = true;
		while(check) {
			System.out.println("1. 점심 메뉴");
			System.out.println("2. 저녁 메뉴");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(bw);
			bw.write(select+"\r \n");
			bw.flush();
			
			if(select == 3) {
				break;
			}
			
			//---------------------
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println(message);
			
		}//while
		
		//자원해제 - 선언부의 역순
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();	

		
	}

}
