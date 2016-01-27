package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterBiz {
	
//	인스턴스 필드
	private Map<Integer, List<String>> seats; //행
	private List<String> seat; //열
	
	private int bookedSeat;
	
	private ScannerPack scanner;
	private SetTheaterSeats setSeats;
	private TheaterMenu menu;
	private BookSeats bookSeats;
	private PrintSeats printSeats;
	
//	Setter & Getter 
	public int getBookedSeat() {
		return bookedSeat;
	}
	
	public void setBookedSeat(int bookedSeat) {
		this.bookedSeat = bookedSeat;
	}

	public Map<Integer, List<String>> getSeats() {
		return seats;
	}
	
	public void setSeats(Map<Integer, List<String>> seats) {
		this.seats = seats;
	}
	
	public List<String> getSeat() {
		return seat;
	}
	
	public void setSeat(List<String> seat) {
		this.seat = seat;
	}

	public TheaterBiz () {
		seats = new HashMap<Integer, List<String>>();
		seat = new ArrayList<String>();

		scanner = new ScannerPack();
		
		setSeats = new SetTheaterSeats();
		menu = new TheaterMenu();
		bookSeats = new BookSeats();
		printSeats = new PrintSeats();
		
		bookedSeat = 0;
	}

	public void program () {
		
//		SetTheaterSeats
		setSeats.program(this);
		
//		TheaterMenu
		menu.headerMenu();
		
//		Program Start! 
		while(true) {

			menu.mainMenu();
			menu.choiceMenu(scanner);
			
//			BookSeats
			if( menu.getFlag() == 1) {
				bookSeats.program(scanner, this, setSeats);
			} 
//			CheckSeats
			else if ( menu.getFlag() == 2 ) {
				printSeats.program(this);
			} 
//			Program exit
			else {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

	
}
