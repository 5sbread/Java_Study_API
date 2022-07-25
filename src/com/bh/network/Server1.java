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
import java.util.Scanner;

public class Server1 {
	public void recieve() throws IOException {
		Scanner sc = new Scanner(System.in);
	
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1통신
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
//========================				
		//메세지 받을 준비
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		//메세지 보낼 준비
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
//=======================		
		
			boolean check = true;
			while(check) {
				
				String message = br.readLine();
				System.out.println("Client : "+message);
				
				if(message.equals("q") || message.equals("Q")) {
					check =! check;
				}//if	
				
				System.out.println("클라이언트에게 보낼 메세지를 입력하세요.");
				message = sc.next();
				
				bw.write(message+"\r\n");
				bw.flush();

				if(message.equals("q") || message.equals("Q")) {
					check =! check;
				}//if
			}//while
					bw.close();
					ow.close();
					os.close();
					br.close();
					ir.close();
					is.close();
					socket.close();
				
		
	}
}