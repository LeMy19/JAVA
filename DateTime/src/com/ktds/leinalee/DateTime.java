package com.ktds.leinalee;

import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public void start () {
//		현재시간 가져오기
		printCurrentMilllSecond();
//		현재 날짜와 시간 출력하기
		printCurrentDateTime();
//		*사용 추천* 현재 날짜와 시간을 출력한다
		printCurrentDateTimeByCalendar();
		
		printDateTimeByCalendar();
//		날짜 빼기
		printDateMinusDate();
//		날자 더하기 즉 100일 알아맞추기
		printDaysAfter();
	}
	
	


	private void printDateMinusDate() {
		Calendar now = Calendar.getInstance();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, (2-1), 14, 10, 59, 45);
		
		long dateTime1 = now.getTimeInMillis();
		long dateTime2 = cal.getTimeInMillis();
		
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		
		long result = (dateTime2 - dateTime1) / 1000;
		System.out.println(result);
		
		long date = Math.round((double)result / 60 / 60 / 24);
		System.out.println("일자: " + date);
		
		int hour = (int) Math.round( (double)result / 60 / 60);
		System.out.println("시간: " + hour);
		
		int minute = (int) Math.round( (double)result / 60);
		System.out.println("분: " + minute);

		System.out.println(minute % 60);
	}


	private void printCurrentMilllSecond() {
//		currenTimeMillis()는 사용해도 된다. 
		long currentSecond = System.currentTimeMillis();
		System.out.println(currentSecond);
	}

	private void printCurrentDateTime() {
		Date date = new Date();
		System.out.println(date.toGMTString());
		//network 쪽 상의 시간으로 나오기때문에 web에서는 사용하면 안된다.
		System.out.println(date.toLocaleString()); 
	}
	
	private void printCurrentDateTimeByCalendar() {
		Calendar now = Calendar.getInstance();
		System.out.println(now.toString());
		System.out.print("년도: ");
		System.out.println(now.get( Calendar.YEAR ));
		System.out.print("월: ");
		System.out.println(now.get( Calendar.MONTH ) + 1);
		System.out.print("일: ");
		System.out.println(now.get( Calendar.DAY_OF_MONTH ));
		System.out.print("오전(0) 오후(1): ");
		System.out.println(now.get( Calendar.AM_PM ));
		System.out.print("시(12): ");
		System.out.println(now.get( Calendar.HOUR ));
		System.out.print("시(24): ");
		System.out.println(now.get( Calendar.HOUR_OF_DAY ));
		System.out.print("분: ");
		System.out.println(now.get( Calendar.MINUTE ));
		System.out.print("초: ");
		System.out.println(now.get( Calendar.SECOND ));
		System.out.print("간: ");
		System.out.println(now.get( Calendar.MILLISECOND ));
		System.out.print("일요일(1) 토요일(7): ");
		System.out.println(now.get( Calendar.DAY_OF_WEEK));
		System.out.print("이번달 일수: ");
		System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public void printDateTimeByCalendar () {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, (2-1), 14, 10, 59, 45);
		
		System.out.println(cal.toString());
		System.out.println(cal.get( Calendar.YEAR ));
		System.out.println(cal.get( Calendar.MONTH ) + 1);
		System.out.println(cal.get( Calendar.DAY_OF_MONTH ));
		System.out.println(cal.get( Calendar.AM_PM ));
		System.out.println(cal.get( Calendar.HOUR ));
		System.out.println(cal.get( Calendar.HOUR_OF_DAY ));
		System.out.println(cal.get( Calendar.MINUTE ));
		System.out.println(cal.get( Calendar.SECOND ));
		System.out.println(cal.get( Calendar.MILLISECOND ));
		System.out.println(cal.get( Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));

	}
	
	private void printDaysAfter() {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_MONTH, 8);
		
		System.out.print("년도: ");
		System.out.println(now.get( Calendar.YEAR ));
		System.out.print("월: ");
		System.out.println(now.get( Calendar.MONTH ) + 1);
		System.out.print("일: ");
		System.out.println(now.get( Calendar.DAY_OF_MONTH ));
		System.out.print("오전(0) 오후(1): ");
		System.out.println(now.get( Calendar.AM_PM ));
		System.out.print("시(12): ");
		System.out.println(now.get( Calendar.HOUR ));
		System.out.print("시(24): ");
		System.out.println(now.get( Calendar.HOUR_OF_DAY ));
		System.out.print("분: ");
		System.out.println(now.get( Calendar.MINUTE ));
		System.out.print("초: ");
		System.out.println(now.get( Calendar.SECOND ));
		System.out.print("간: ");
		System.out.println(now.get( Calendar.MILLISECOND ));
		System.out.print("일요일(1) 토요일(7): ");
		System.out.println(now.get( Calendar.DAY_OF_WEEK));
		System.out.print("이번달 일수: ");
		System.out.println(now.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public static void main(String[] args) {
		DateTime time = new DateTime();
		time.start();
	}
}
