package com.ktds.leinalee;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class TheaterMenu {
	
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void headerMenu() {
		System.out.println("======================");
		System.out.println("  Welcome to Theater  ");
		System.out.println("======================");
	}
	
	public void mainMenu() {
		System.out.println("1. 영화관 좌석 예약 ");
		System.out.println("2. 영화관 좌석 확인");
		System.out.println("9. 프로그램 종료");
		System.out.println("======================");
	}
	
	public void choiceMenu(ScannerPack scanner) {
		System.out.println("메뉴를 입력하세요 :");
		this.setFlag(scanner.inputInt());
		
	}
}
