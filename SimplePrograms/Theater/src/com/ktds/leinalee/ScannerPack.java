package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScannerPack {
	
	private Scanner scanner;

	public ScannerPack () {
		scanner = new Scanner(System.in);
	}

	public int inputInt () {
		scanner = new Scanner(System.in);
		
		while(true) {
			try {
				return scanner.nextInt();
			}
			catch (InputMismatchException ime) {
				scanner = new Scanner(System.in);
				System.out.println("메뉴를 잘 못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public String inputString() {
		scanner = new Scanner(System.in);
		
		while(true) {
			try {
				return scanner.nextLine();
			}
			catch (InputMismatchException ime) {
				scanner = new Scanner(System.in);
				System.out.println("잘 못 입력하셨습니다. 다시 입력하세요.");
			}
		}
	}
	
	public List<Integer> inputSeatNumber() {
		
		scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		List<Integer> selectedSeaNumbers = new ArrayList<Integer>();
		
		while(true) {
			try {
				
//				좌우 공백제거 
				string.trim();
//				여분의 공백 제거 -> 1, 6 -> 1,6
				string.replace(" ", "");
//				,(Comma)를 기준으로 자르기
				String seatNumbers[] = string.split(",");
				
				selectedSeaNumbers.add(Integer.parseInt(seatNumbers[0]));
				selectedSeaNumbers.add(Integer.parseInt(seatNumbers[1]));
				
				return selectedSeaNumbers;
			}
			catch (NumberFormatException | ArrayIndexOutOfBoundsException error) {
				scanner = new Scanner(System.in);
				System.out.println("좌석을 잘 못 입력하셨습니다. 다시 입력하세요.");
			}
			
		}
	}

	
}
