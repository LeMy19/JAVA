package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputPackage {

	private Scanner input;
	
	public InputPackage () {
		input = new Scanner(System.in);
	}
	
	public int inputInt () {
		while (true) {
			try {
				return input.nextInt();
			}
			catch (InputMismatchException error) {
				System.out.println("다시입력하세요.");
				input = new Scanner(System.in);
			}
		}
	}
	
	public long inputLong () {
		while (true) {
			try {
				return input.nextInt();
			}
			catch (InputMismatchException error) {
				System.out.println("다시입력하세요.");
				input = new Scanner(System.in);
			}
		}	
	}
	
	
	public String inputString() {
		input = new Scanner(System.in);
		
		while(true) {
			try {
				return input.nextLine();
			}
			catch (InputMismatchException ime) {
				input = new Scanner(System.in);
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public int inputMainMenu () {
		input = new Scanner(System.in);
		
		while (true) {
			int menuNumber = 0;
			String inputMenu = input.nextLine();
			
			if ( inputMenu.equalsIgnoreCase("exit") ) {
				System.exit(0);
			} 
			else if ( inputMenu.matches("^[1-4]") ) {			
				menuNumber = Integer.parseInt(inputMenu);
				return menuNumber;
			} 
			else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public boolean inputPreCheck () {
		input = new Scanner(System.in);
		
		while (true) {
			String inputMenu = input.nextLine();
			
			if ( inputMenu.equalsIgnoreCase("Y") ) {
				return true;
			} 
			else if ( inputMenu.equalsIgnoreCase("N") ) {
				return false;
			} 
			else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
}
