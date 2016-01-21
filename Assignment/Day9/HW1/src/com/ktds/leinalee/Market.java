package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	public void showMenu () {
		System.out.println("\n------menu------");
		System.out.println("1....�����....");
		System.out.println("2...������Ȯ��...");
		System.out.println("3...�������Ȯ��...");
		System.out.println("4....����Ǳ�....");
		System.out.println("5.....������.....");
		System.out.println("6....�����º���....");
		System.out.println("----------------");
		System.out.print("���ϴ� �޴��� �����ϼ���. \n����:");
		
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
		
		System.out.println("<<��谡�Կ� ���� ���� ȯ���մϴ�>>");
		customer.setInfo(scanner);

		while (true) {
			showMenu();
			menu = scanner.nextInt();
	
			if ( menu == 1) {
				ageCheck = customer.ageCheck();
				if (ageCheck == false) {
					System.out.println("�̼����ڴ� ��踦 �� �� �����ϴ�.");
					continue;
				} 
				System.out.println("���� ��� ����:"+store.cigarettePrice);
				System.out.print("���� ��������:");
				inputMoney = scanner.nextInt();
				
				System.out.print("��踦 � ���� ���ϼ���:");
				selectedCigarette = scanner.nextInt();

				moneyCheck = customer.moneyCheck(inputMoney, selectedCigarette, customer, store);
				if ( moneyCheck == false ) {
					
					System.out.println("���� ���� �� ��踦 �� �� �����ϴ�.");
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
				System.out.println("��谡�Ը� ����ϴ�... �ȳ���������!");
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
