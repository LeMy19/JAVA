package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	public void menu() {
		
		System.out.println("\n1. 계란 후라이 구매");
		System.out.println("2. 현재 내 상태 확인");
		System.out.println("3. 현재 자판기 상태 확인");
		System.out.println("4. 종료하기");
		System.out.print("해당하는 번호를 입력하세요: ");
		
	}

	public void start() {
		
		//variables 
		int money;
		int menuState;
		int payMoney;
		
		VendingMachine eggMachine = new VendingMachine();
		
		Market trade = new Market();
		Scanner scanner = new Scanner(System.in);
		
		//star program
		System.out.println("<<개수를 이용한 계란 후라이 자판기>>");
		System.out.print("소지하고 있는 돈의 액수 : ");
		money = scanner.nextInt();

		Customer customerOne = new Customer( money );
		
		//choice menu
		while(true) {
			menu();
			menuState = scanner.nextInt();
			
			if( menuState == 1 ) {
				System.out.print("돈을 얼마나 넣을 것 입니까?");
				payMoney = scanner.nextInt();	
				if (customerOne.checkMoney(payMoney) == false) {
					System.out.println("제시한 금액을 소지하고 있지 않습니다.");
					break;
				}
				if( eggMachine.canPossible(payMoney) == true ) {
					eggMachine.getMoneyFromCustomer(payMoney, customerOne);
					eggMachine.sellEgg(customerOne);
					eggMachine.giveRemain(payMoney, customerOne);
				} else {
					System.out.println("\n계란 후라이 품절...");
					break;
				}
			} else if ( menuState == 2 ) {
				customerOne.printInfo();
			} else if ( menuState == 3 ) {
				eggMachine.printInfo();
			} else if ( menuState == 4 ) {
				break;
			} else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
	}
	
	public static void main(String[] args) {

		Market market = new Market();
		market.start();

	}
}
