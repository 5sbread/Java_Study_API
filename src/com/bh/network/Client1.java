package com.bh.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	public void send() throws Exception {

		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.15", 8282); //아이피, 포트번호
		System.out.println("Server 접속 완료");
//===============================		
		OutputStream os = socket.getOutputStream();//0,1을 처리
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자 한글자 처리
		BufferedWriter bw = new BufferedWriter(ow); //문자열 처리
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
//===============================		
		boolean check = true;
		while(check) {
		
			System.out.println("서버로 보낼 메세지를 입력하세요.");
			String message=sc.next();
				
				//전송
				bw.write("=0.0= "+message+"\r\n"); // \r : 밀어내기 | \n : 줄바꿈
				bw.flush();
			
				if(message.equals("q") || message.equals("Q")) {
					check =! check;	
				}
		//---------------------------------------------
				//서버에서 보낸 메세지 받을 준비
				message = br.readLine();
				System.out.println("Server : "+message);
				
				if(message.equals("q") || message.equals("Q")) {
					check =! check;	
				}
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
