package com.bh.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {
	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance(); //현재시간
		System.out.println(ca.getTime());
		
		//ca.roll(Calendar.MINUTE, 20);
		//20분을 흐르게 하기
		//지정한 필드만 흐름 ('시'는 안흘러감)
		
		ca.add(Calendar.MINUTE, 20);
		//시도 흘러감
		
		System.out.println(ca.getTime());
		
//------------------------------------------------		
		System.out.println("====================");
		ca = Calendar.getInstance();
		
		String pattern = "yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		
		String time = sd.format(ca.getTime());
		//ca.getTime() : 캘린더 타입인 ca를 Date 타입으로 바꿈
		System.out.println(time);
		
	}

}
