package com.bh.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
			String message = br.readLine();
			System.out.println(message);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//연결된 역순으로 자원 해제
			try {
				br.close();
				ir.close();
				is.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	
		//DDOS
		//DOS : Denial Of Service
		
		
		//sc.close();
		//서비스를 사용한 후 닫아야 다른 컴퓨터에서 서비스 사용 가능
		
	}

}
