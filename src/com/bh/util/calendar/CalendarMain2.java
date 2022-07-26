package com.bh.util.calendar;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //15:07
		
		Calendar future = Calendar.getInstance(); //15:15
		future.set(Calendar.MINUTE, 40);
		
		long n = now.getTimeInMillis();
		long f = future.getTimeInMillis();
		
		long result = f - n;
		System.out.println(result);
		System.out.println(result/1000); //초단위
		System.out.println(result/(1000*60)); //분단위
		System.out.println();
		
//========================================================
		
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 1999);
		birth.set(Calendar.MONTH, 8);
		birth.set(Calendar.DATE, 16);

		long b = future.getTimeInMillis();
		
		long re = n - b;
		re = re/(1000*60*60*24);
		re = re/365;
		System.out.println(re);
		System.out.println();

	}

}
