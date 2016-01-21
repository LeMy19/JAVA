package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	public void showMenu () {
		System.out.println("\n------menu------");
		System.out.println("1....담배사기....");
		System.out.println("2...내상태확인...");
		System.out.println("3...가게재고확인...");
		System.out.println("4....담배피기....");
		System.out.println("5.....집으로.....");
		System.out.println("6....내상태변경....");
		System.out.println("----------------");
		System.out.print("원하는 메뉴를 선택하세요. \n선택:");
		
	}
		
	public void start () {
				
		int menu;
		int age;

		int inputMoney;
		int selectedCigarette;
		boolean ageCheck = true;
		boolean moneyCheck = true;
		
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		Store store = new Store();	
		
		System.out.println("<<담배가게에 오신 것을 환영합니다>>");
		customer.setInfo(scanner);

		while (true) {
			showMenu();
			menu = scanner.nextInt();
	
			if ( menu == 1) {
				ageCheck = customer.ageCheck();
				if (ageCheck == false) {
					System.out.println("미성년자는 담배를 살 수 없습니다.");
					continue;
				} 
				System.out.println("현재 담배 가격:"+store.cigarettePrice);
				System.out.print("돈을 넣으세요:");
				inputMoney = scanner.nextInt();
				
				System.out.print("담배를 몇개 살지 정하세요:");
				selectedCigarette = scanner.nextInt();

				moneyCheck = customer.moneyCheck(inputMoney, selectedCigarette, customer, store);
				if ( moneyCheck == false ) {
					
					System.out.println("금전 관계 상 담배를 살 수 없습니다.");
					continue;
				}
				
				store.getMoney(inputMoney, customer);
				store.giveChange(inputMoney, selectedCigarette, customer);
				store.giveCigarette(customer);
				
			} else if ( menu == 2 ) {
				customer.printInfo();
			} else if ( menu == 3) {
				store.printInfo();
			} else if ( menu == 4 ) {
				customer.isSmoking();
			} else if ( menu == 5 ) {
				System.out.println("담배가게를 벗어납니다... 안녕히가세요!");
				break;
			} else if ( menu == 6) {
				customer.setInfo(scanner);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Market mart = new Market();
		mart.start();
		
	}

}
