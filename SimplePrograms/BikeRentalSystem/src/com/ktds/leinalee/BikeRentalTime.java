package com.ktds.leinalee;

import java.util.Calendar;

public class BikeRentalTime {

	public static final int TIME = 10;
	
	public int timeCheck () {
		Calendar cal =Calendar.getInstance();
		long now = cal.getTimeInMillis();
		return (int)Math.round( (double)now / 1000 / 60 );
	}
	
	public int totalRentalTime (int checkTime, int now) {
		int totalRentTime = now - checkTime;
		return totalRentTime;
	}
	
	public void printTime() {
		Calendar cal = Calendar.getInstance();
		System.out.print(cal.get( Calendar.HOUR_OF_DAY ) + "시 ");
		System.out.print(cal.get( Calendar.MINUTE ) + "분 ");
		System.out.print(cal.get( Calendar.SECOND ) + "초 \n");
		
	}
}
