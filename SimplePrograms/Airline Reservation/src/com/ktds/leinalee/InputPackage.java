package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputPackage {

	Scanner input = new Scanner(System.in);
	
	public int inputInt() {
		input = new Scanner(System.in);
		while (true) {
			try {
				return input.nextInt();
			} catch (InputMismatchException error) {
				input = new Scanner(System.in);
				System.out.println("잘 못 입력하였습니다.");
			}
		}
	}
	
	public String inputString () {
		input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public int[] inputSeat() {
		input = new Scanner(System.in);
		int seatNumber[] = {0,0};
		
		String tempSeatNumber = input.nextLine();
		tempSeatNumber = tempSeatNumber.trim();
		tempSeatNumber = tempSeatNumber.replace(" ", "");
		
		String splitedSeatNumber[] = tempSeatNumber.split(",");
		seatNumber[0] = Integer.parseInt(splitedSeatNumber[0]);
		seatNumber[1] = Integer.parseInt(splitedSeatNumber[1]);
		
		return seatNumber;
	}
}
