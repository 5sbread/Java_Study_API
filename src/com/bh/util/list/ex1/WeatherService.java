package com.bh.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private Scanner sc;
	private StringBuffer sb;
	
	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer(); //String타입 아님
		//sb.equals(sb) 불가능
		sb.append("Seoul-30.2-70-맑음");
		sb.append("Daegu-38.9-90-흐림");
		sb.append("Jeju-12.1-10-눈");
		sb.append("Busan-0.5-85-태풍");
	}
	
			//init : 초기화할 때 많이 사용(전산영어:IT업계에서 사용하는 영어)
	public void init(ArrayList<CityDTO> ar) {
		String data = sb.toString();
		data = data.replace("-", ",");
		
		//여러개의 데이터가 DTO일 때 -> Tokenizer 사용
		StringTokenizer st = new StringTokenizer(data, ",");
										 //(파싱할데이터, 나눌 기준)
		
		while(st.hasMoreTokens()){
			CityDTO cityDTO = new CityDTO(); //저장할 도시 4개 -> DTO도 4개
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
	public CityDTO find (ArrayList<CityDTO> ar) {
		CityDTO cityDTO = null;
		System.out.println("찾고자하는 도시명을 입력하세요.");
		String name = sc.next().toLowerCase();
		
		for(CityDTO cityDTO2 : ar) {
			if(name.equals(cityDTO2.getName().toLowerCase()))
			cityDTO = cityDTO2;
			break;
		}
		
		return cityDTO;
	}
	
	
//---------------------------------------------------
	public boolean add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시명을 입력하세요.");
		cityDTO.setName(sc.next());
		System.out.println("기온을 입력하세요.");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("습도를 입력하세요.");
		cityDTO.setHum(sc.nextInt());
		System.out.println("날씨를 입력하세요.");
		cityDTO.setStatus(sc.next());
		
		return ar.add(cityDTO);
	}

//---------------------------------------------------
	public void remove(ArrayList<CityDTO> ar) {
		System.out.println("삭제하려는 도시명을 입력하세요.");
		System.out.println(ar);
		System.out.println();
		boolean r = false;
		String name = sc.next().toUpperCase();
								//전부 대문자로 변경 (소문자는 Lower)
		
		//전통 for - 일치하는 도시명 찾기
		for(int i=0; i<ar.size(); i++) {
						//ar=arraylist / 
						//ar.get(i) -> CityDTO의
			if(name.equals(ar.get(i).getName().toUpperCase())) {
		    //문자열 비교는 == 불가 / equals 사용
				ar.remove(i);
				r =! r;
				break;
			}//if
		}//for
		
		
		//향상된 for
		  //데이터타입 변수명: 참조변수명
//		for(CityDTO cityDTO: ar) {
//			if(name.equals(cityDTO.getName())) {
//				ar.remove(cityDTO);
//				break;
//			}
//		}
		
	}
	
	
	
}

