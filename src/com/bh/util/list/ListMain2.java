package com.bh.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//
		ArrayList ar = new ArrayList<>(); //<> 제네릭 -> 보장?
		
		ar.add("first");
		ar.add(2); //integer 클래스로 auto boxing되어서 들어감
		//object에 String과 integer 타입 다양하게 담는 것 -> 다형성 때문에 가능
		ar.add('c'); //character auto boxing
		ar.add(2.123); //Double auto boxing
		ar.add(null);
		
		ListView listView = new ListView();
		listView.view(ar);
		

		//get -> 특정 인덱스의 데이터를 반환 (꺼내기)
		String n1 = (String) ar.get(0); //다형성 때문에 형변환 해야함
		int n2 = (int) ar.get(1);
		
		System.out.println(n1);
		
	}

}
