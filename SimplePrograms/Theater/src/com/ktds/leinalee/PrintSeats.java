package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class PrintSeats {
	
	private SetTheaterSeats forTotalNumber;
	
	public PrintSeats () {
		forTotalNumber = new SetTheaterSeats();
	}

	public void printSeats (TheaterBiz biz) {
		
		// 좌석 출력하기
		for (int i = 0; i < 5; i++) {			
			if( biz.getSeats().get(i) != null ) {	
//				for (String s : seat) {
				for (String s : biz.getSeats().get(i)) {
					System.out.print(s);
				}
				System.out.println("");
			} 
/*			else {
				System.out.println("처음부터 존재하는 영화관 좌석이 없습니다.");
			}*/
		}
		
	}
	
	public void program (TheaterBiz biz) {
		
		System.out.println("======================");
		this.printSeats(biz);
		System.out.println("======================");
		
		System.out.println("총 " + biz.getBookedSeat() + "자리 예약되었습니다.");
	}
}
