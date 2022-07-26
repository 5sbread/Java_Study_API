package com.bh.network;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server Start");
		Server1 s1 = new Server1();
		Server2 s2 = new Server2();
		
		
		//try-catch
		try {
			//s1.recieve();
			s2.getFood();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Server Finish");

		//실행 후 엑세스 허용
	}

}
