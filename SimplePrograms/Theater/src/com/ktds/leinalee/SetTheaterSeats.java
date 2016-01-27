package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetTheaterSeats {
	
	private ScannerPack scanner;
	
	private int row;
	private int cell;
	private int total; 
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getCell() {
		return cell;
	}
	
	public void setCell(int cell) {
		this.cell = cell;
	}

//		생성자
	public SetTheaterSeats() {
		scanner = new ScannerPack();
	}
	
//	전체 좌석 구하기
	public void seatCount () {
		this.setTotal( this.getCell() * this.getRow() );
	}
	
	public void setTheaterSize () {
		System.out.println("영화관 좌석 크기(size) 설정을 시작합니다.");
		
		System.out.print("행: ");
		this.setRow(scanner.inputInt());
		
		System.out.print("열: ");
		this.setCell(scanner.inputInt());
	}
	
//	 좌석 만들기
	public void setTheaterSeats (TheaterBiz biz) {
		
		List<String> seat = null;
		
		if ( this.row > 0 && this.cell > 0) {
			for (int j = 0; j < this.row; j++) {
				seat = new ArrayList<String>();
				for (int i = 0; i < this.cell; i++) {
					seat.add("□");
				}
				biz.getSeats().put(j, seat);
			}
		} 
		else {
			System.out.println("제대로된 영화관을 생성할 수 없습니다.");
		}
		
	}
	
	public void program (TheaterBiz biz) {
		
		this.setTheaterSize();
		this.seatCount();
		this.setTheaterSeats(biz);
		
	}

}
