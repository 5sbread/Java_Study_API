package com.bh.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {

	Scanner sc = new Scanner(System.in);
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		
		System.out.println("원하는 서비스를 선택하세요.");
		System.out.println("1. 날씨정보 초기화");
		System.out.println("2. 전국날씨 출력");
		System.out.println("3. 지역날씨 정보 검색");
		System.out.println("4. 지역날씨 추가");
		System.out.println("5. 지역정보 삭제");
		System.out.println("6. 프로그램 종료");
		
		int select = sc.nextInt();
		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();
		
//		if(select == 1) {
//			ws.clear();
//		}else(select == 2){
//			ws.view1();
//		}else(select == 3){
//			ws.find();
//		}else(select == 4){
//			ws.add();
//		}else(select == 5){
//			ws.remove();
//		}else(select == 6){
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}
		
		
	}
}
