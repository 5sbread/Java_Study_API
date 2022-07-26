package com.bh.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		this.getNum();
		
	}
	
	

	private void getNum() {
		
		for(int i=0; i<25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
				//0.5초 자고 난 후 다음으로 진행
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //클래스메서드
		}
	}
	
}
