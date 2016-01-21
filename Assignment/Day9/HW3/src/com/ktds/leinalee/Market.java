package com.ktds.leinalee;

/*
 * 2. ���Ǳ�
 * �迭�� �̿��� ���Ǳ� - Scanner�� �̿��Ѵ�
 * �� ���Ǳ�� �ݶ�, ��������Ʈ, ȯŸ�� �Ǹ��Ѵ�.
 * �� ����� �ִ� 15���� ����.
 * �� ������ ������ ��� �ٸ���.
 * �Һ��ڴ� �ѹ��� ������� ���� ���� ���Ḧ �� �� �ִ�. (������ ������ ���ؼ� �� �� �ִ�)
 * ���Ǳ��� ���ᰡ ��� �Һ�ǰų� �Һ����� �ݾ��� ������ ���Ẹ�� ���ٸ� �ǸŰ� ����ȴ�. 
 * 
 */

import java.util.Scanner;

public class Market {
	
	public void menu ( ) {
		System.out.println("<<Welcome to Leina's Vending Machine!>>");
		System.out.println("1.�ݶ� : 1000��");
		System.out.println("2.��������Ʈ : 1200��");
		System.out.println("3.ȯŸ : 800��");
	}

	public void start () {
		
		int menu;
		int count;
		int money;
		boolean canOrderCheck;
		
		Scanner scanner = new Scanner(System.in);
		Customer customerOne = new Customer();
		VendingMachine vendingMachine = new VendingMachine();
		
		// ���α׷����� 
		menu();

		System.out.print("���� �־��ּ��� : ");
		money = scanner.nextInt();
		vendingMachine.earnMoney(money, customerOne);
		
		while(true) {
			System.out.print("���ð� ���� ���Ḧ ������ : ");
			menu = scanner.nextInt();
			System.out.print("����� ������ �Է��ϼ��� : ");
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
