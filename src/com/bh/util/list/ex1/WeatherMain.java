package com.bh.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		
		//1. 클래스의 역할과 메서드의 역할, 변수의 역할
		//WeatherMain : 프로그램 실행, 중간테스트
		//WeatherService : 데이터 가공
		//WeatherController : 관리
		//WeatherView : 출력 전용
		//CityDTO : 데이터 선언
		
		WeatherView wv = new WeatherView();
		WeatherService ws = new WeatherService();
		
		
//		wv.view("test");
	
		//테스트용 값 만들어 주기
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName("NY");
		cityDTO.setGion(30);
		cityDTO.setHum(20);
		cityDTO.setStatus("비");
		
		wv.view(cityDTO);
		
		CityDTO cityDTO2 = new CityDTO();
		cityDTO2.setName("LA");
		cityDTO2.setGion(17);
		cityDTO2.setHum(90);
		cityDTO2.setStatus("눈");
		
		ArrayList<CityDTO> ar = new ArrayList<>();
		//위에서 만든 NY, LA를 넣을 집합
		ar.add(cityDTO);
		ar.add(cityDTO2);
		//배열에 만든 값 집어넣기
		
		wv.view(ar);

//--------------------------
		ws.add(ar);
		wv.view(ar);
		
		WeatherController wc = new WeatherController();
		wc.start();
		
		
	}

}
