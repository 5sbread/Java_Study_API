package com.bh.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		//두개 같은 의미
		//캘린더의 getInstance 안에 그래고리안캘린더가 있음
		//Calendar ca = new GregorianCalendar();
		Calendar ca = Calendar.getInstance();
		//현재 년 월 일 시 분 초 밀리세컨즈 정보가 들어감
		
		System.out.println(ca);
		//2002년 12월 25일
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 0);
		ca.set(Calendar.DATE, 25);
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DAY_OF_MONTH);
		//0부터 시작해서 month만 숫자 작게 나옴
		int h = ca.get(Calendar.HOUR_OF_DAY);
		//int h = ca.get(Calendar.HOUR);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		
		long milis = ca.getTimeInMillis();
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(milis);
		
		
	}

}
