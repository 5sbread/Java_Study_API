package com.bh.lang;

public class Car {

	//오버라이딩
	public boolean equals(Object obj) {
		Car car = (Car)obj; //강제형변환
		return true; //값에 상관없이 true라고 리턴
	}
	
	public String toString() {
		return "CAR에서 오버라이딩함";
	}
	
}
