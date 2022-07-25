package com.bh.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadTest1 t1 = new ThreadTest1();
		//t1.getNum();
		
		ThreadTest2 t2 = new ThreadTest2();
		//t2.getAlpa();
		
		Thread t = new Thread();
		//개발자가 직접 호출이 아니라
		//OS에 실행 부탁
		
		t1.start();
		t.start();
		//ㄴ 
		

	}

}
