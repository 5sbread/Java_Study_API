package com.bh.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	Scanner sc = new Scanner(System.in);
	
	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-30.2-70-맑음");
		sb.append("Daegu-38.9-90-흐림");
		sb.append("Jeju-12.1-10-눈");
		sb.append("Busan-0.5-85-태풍");
	}
	
	public void init(ArrayList<CityDTO> ar) {
		String data = sb.toString();
		data = data.replace("-", ",");
		
		StringTokenizer st = new StringTokenizer(data);
		
		while(st.hasMoreTokens()){
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
		}
	}
	
//--------------------------------------------------
//	public void clear() {
//		ArrayList ar = new ArrayList<>();
//		
//		ar.clear();
//		ArrayList<CityDTO>(ar);
//		
//		System.out.println(ar.size());
//	}	
	
//---------------------------------------------------
	public void find () {
		
	}
	
	
//---------------------------------------------------
	public void add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName("test");
		cityDTO.setGion(23.3);
		cityDTO.setHum(70);
		cityDTO.setStatus("sun");
		
		ar.add(cityDTO);
	}

//---------------------------------------------------
	public void remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제하려는 도시명을 입력하세요.");
		System.out.println(ar);
		String name = sc.next();
		
		
		
		
	}
	
	
	
}

