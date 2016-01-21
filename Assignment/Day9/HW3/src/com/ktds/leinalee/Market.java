package com.ktds.leinalee;

/*
 * 2. 자판기
 * 배열을 이용한 자판기 - Scanner을 이용한다
 * 이 자판기는 콜라, 스프라이트, 환타를 판매한다.
 * 각 음료는 최대 15개가 들어간다.
 * 각 음료의 가격은 모두 다르다.
 * 소비자는 한번의 사용으로 여러 개의 음료를 살 수 있다. (음료의 개수를 정해서 살 수 있다)
 * 자판기의 음료가 모두 소비되거나 소비자의 금액이 최저가 음료보다 적다면 판매가 종료된다. 
 * 
 */

import java.util.Scanner;

public class Market {
	
	public void menu ( ) {
		System.out.println("<<Welcome to Leina's Vending Machine!>>");
		System.out.println("1.콜라 : 1000원");
		System.out.println("2.스프라이트 : 1200원");
		System.out.println("3.환타 : 800원");
	}

	public void start () {
		
		int menu;
		int count;
		int money;
		boolean canOrderCheck;
		
		Scanner scanner = new Scanner(System.in);
		Customer customerOne = new Customer();
		VendingMachine vendingMachine = new VendingMachine();
		
		// 프로그램시작 
		menu();

		System.out.print("돈을 넣어주세요 : ");
		money = scanner.nextInt();
		vendingMachine.earnMoney(money, customerOne);
		
		while(true) {
			System.out.print("마시고 싶은 음료를 고르세요 : ");
			menu = scanner.nextInt();
			System.out.print("음료수 개수를 입력하세요 : ");
			count = scanner.nextInt();
			
			
			canOrderCheck;
			if( canOrderCheck == false )
				break;
			vendingMachine.getOrder(menu, count);
		}
		
		System.out.println("");
		vendingMachine.getMoneyFromCustomer(money, customerOne);
		
	}
	
	public static void main(String[] args) {
	
		Market market = new Market();
		market.start();
	}

}
