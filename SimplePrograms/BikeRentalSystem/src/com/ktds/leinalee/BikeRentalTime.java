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
}
