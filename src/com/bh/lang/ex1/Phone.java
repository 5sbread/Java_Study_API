package com.bh.lang.ex1;

public class Phone {
	
	private int price;
	private int size;
	
	//equals 메서드 오버라이딩
	//각 멤버의 값이 같으면 true, 하나라도 다르면 false 리턴
	//참조변수 this
	
	@Override //equals 오버라이딩 자동완성
	public boolean equals(Object obj) { //obj=p2 <-obj타입에 들어있음
		// TODO Auto-generated method stub
		Phone phone = (Phone) obj; //강제형변환 / 다형성
		//this.getPrice()  phone.getPrice(); //this = p1
		
		boolean check = false;
		if(this.getPrice()==phone.getPrice() && this.getSize()==phone.getSize()) {
			check =! check;
		}
		
		return check;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
