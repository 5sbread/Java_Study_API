package com.bh.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면"); //index 0
		lunch.add("라면"); //1
		lunch.add("햄버거"); //2
		lunch.add("피자"); //3
		lunch.add("파스타"); //4
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("육회");
		dinner.add("볶음밥");
		dinner.add("물");
	}


//getFood
//Server에서 메세지를 기다림
//1 : 점심 메뉴 중 하나를 랜덤으로 Client에 전송
//2 : 저녁 메뉴 중 하나를 랜덤으로 Client에 전송
//3 : 프로그램 종료
//그외 나머지 : 잘못 입력된 번호입니다.를 Client로 전송

	public void getFood () throws IOException{
		ServerSocket serverSocket = new ServerSocket(8282);
		Socket socket = serverSocket.accept();
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		//메세지 보낼 준비
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		boolean check = true;
		while(check) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine();
			
			int select = Integer.parseInt(message);
			
			Random random = new Random(Calendar.getInstance().getTimeInMillis()); //완전 랜덤하게 하기 위해 현재 시간 넣어주기

			if(select==1) {
				int index = random.nextInt(lunch.size()); //점심 인덱스 갯수 5
				message = lunch.get(index);
				
			}else if(select==2){
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
		
			}else if(select==3){
				break;
			}else {
				message = "잘못된 번호입니다.";
			}//if
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(message+"\r \n");
			bw.flush();
			
		}//while
		
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		socket.close();
		
	}//메서드
}//클래스







