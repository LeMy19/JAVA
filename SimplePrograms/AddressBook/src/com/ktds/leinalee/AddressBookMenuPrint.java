package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddressBookMenuPrint {

//	instance field
	private int flag;
	
	private Scanner scanner;
	
//	Setter & Getter
	public int getFlag() {
		return flag;
	}
	
	public AddressBookMenuPrint() {
		scanner = new Scanner(System.in);
		this.headerMenu();
	}
	
//	method
	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void headerMenu() {
		System.out.println("===============================");
		System.out.println("       주소록 관리 프로그램");
		System.out.println("===============================");		
	}
	
	public void mainMenu() {
		System.out.println("1. 주소 등록");
		System.out.println("2. 주소 찾기");
		System.out.println("3. 주소 삭제");
		System.out.println("4. 주소 업데이트");
		System.out.println("5. 등록된 주소 목록 보기");
		System.out.println("9. 종료");
		System.out.println("-------------------------------");		
	}
	
	public int choiceMenu() {
		while (true) {
			try {
				this.setFlag(scanner.nextInt());
				return this.getFlag();
			} 
			catch (InputMismatchException ime) {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1, 2, 3, 4, 5, 9 가운데 입력하세요.");
				scanner = new Scanner(System.in);
			} 
		}
	}
	
}
