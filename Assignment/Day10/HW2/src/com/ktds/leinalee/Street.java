package com.ktds.leinalee;

import java.util.Scanner;

public class Street {

	public static void main (String[] args) {
		
//		create Machine instance
		Machine machine = new Machine();
		
		machine.setColaQuantity(15);
		machine.setSpriteQuantity(5);
		machine.setfantaQuantity(7);
		
		machine.setColaPrice(1300);
		machine.setSpritePrice(1100);
		machine.setFantaPrice(1100);
		
//		create Customer instance 
		People customer = new People();
		customer.setColaQuantity(0);
		customer.setSpriteQuantity(0);
		customer.setFantaQuantity(0);
		customer.setMoney(3000);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("돈을 넣어주세요.");
		customer.setMoney(scanner.nextInt());
		
//		변수 선언
		int customerMoney;
		int quantity; 
		int drinkNumber;
		
//		program start!!
		while(true) {
			
//			사용자의 돈 확인 
			if ( customer.getMoney() <= 0 ) {
				break;
			}
				
//			메뉴 출력 
			machine.printMenu();
			
//			사용자의 돈 setting
			System.out.println("돈을 넣어주세요.");
			customerMoney = scanner.nextInt();
			if ( !machine.getMoney(customerMoney, customer) ) {
				System.out.println("돈이 부족합니다.");
				break;
			}
			
//			drinkNumber(음료수 종류), quantity(음료수 개수), Customer
			System.out.println("음료수 종류를 입력하세요.");
			drinkNumber = scanner.nextInt();
			System.out.println("음료수 개수를 입력하세요.");
			quantity = scanner.nextInt();
			
			machine.giveDrink(drinkNumber, quantity, customer);
			
//			customer Infomation print
			customer.printInfo();
			
//			출력 시간 늦추기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
