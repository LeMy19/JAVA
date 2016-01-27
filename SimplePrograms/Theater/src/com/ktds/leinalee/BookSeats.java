package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class BookSeats {
	
	private List<Integer> selectedSeatNumber;
	private String seatNumber;
	private SetTheaterSeats getSeatsCount;
	
	public List<Integer> getSelectedSeatNumber() {
		return selectedSeatNumber;
	}

	public void setSelectedSeatNumber(List<Integer> selectedSeatNumber) {
		this.selectedSeatNumber = selectedSeatNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

//	생산자
	public BookSeats() {
		selectedSeatNumber = new ArrayList<Integer>();
		getSeatsCount = new SetTheaterSeats();
	}
	
//	예약좌석 입력하기
	public void inputSeatNumber(ScannerPack scanner) {
		
		System.out.println("예약하고 싶은 좌석을 입력하세요.");
		System.out.println("예시 입력: 1, 6 ");
		
		selectedSeatNumber = scanner.inputSeatNumber();
		
	}
	
//	예약석인지 확인
	public boolean isSeatBooked (TheaterBiz biz, SetTheaterSeats setSeat) {
		List<String> selectedSeats = biz.getSeats().get(selectedSeatNumber.get(0));
		
		if( selectedSeats.get(selectedSeatNumber.get(1)) == "□" ) {
			return true;
		}
		
		return false;
	}

//	좌석 예약하기
	public void bookSeats (ScannerPack scanner, TheaterBiz biz, SetTheaterSeats setSeat) {
		
		List<String> selectedSeats = biz.getSeats().get(selectedSeatNumber.get(0));
		
		try {
//			예약석인지 확인
			if( isSeatBooked(biz, setSeat) ) {
				selectedSeats.set(selectedSeatNumber.get(1), "■");
				int temp = biz.getBookedSeat();
				biz.setBookedSeat(temp+1);
			}
			else {
				System.out.println("좌석을 예약할 수 없습니다.");
			}
		}
		catch(IndexOutOfBoundsException error) {
			System.out.println("없는 좌석을 입력하였습니다.");
		}
		
	}
	
	
//	프로그램 
	public void program (ScannerPack scanner, TheaterBiz biz, SetTheaterSeats setSeat) {
		
		this.inputSeatNumber(scanner);
		this.bookSeats(scanner, biz, setSeat);
	}
}
