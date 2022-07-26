package com.bh.util.list;

import java.util.ArrayList;

public class ListView {

	//list를 받아서 안에 있는 데이터 출력
	
	public void view(ArrayList ar) {
		
		for(int i=0; i<ar.size(); i++) {
			           //length와 같은 기능
			System.out.println(ar.get(i));
		}
		System.out.println("====================");
		
	}
}
