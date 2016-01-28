package com.ktds.leinalee;

import java.util.Calendar;

public class CheckTime {

//	현재시간 저장 
	public int timeCheck () {
		Calendar cal =Calendar.getInstance();
		long now = cal.getTimeInMillis();
		return (int)Math.round( (double)now / 1000 );
	}
	
//	차이계산
	public int totalRentalTime (int previousTime, int currentTime) {
		int totalRentTime = currentTime - previousTime;
		return totalRentTime;
	}
}
