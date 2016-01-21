package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	public void menu() {
		
		System.out.println("\n1. ��� �Ķ��� ����");
		System.out.println("2. ���� �� ���� Ȯ��");
		System.out.println("3. ���� ���Ǳ� ���� Ȯ��");
		System.out.println("4. �����ϱ�");
		System.out.print("�ش��ϴ� ��ȣ�� �Է��ϼ���: ");
		
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
		System.out.println("<<������ �̿��� ��� �Ķ��� ���Ǳ�>>");
		System.out.print("�����ϰ� �ִ� ���� �׼� : ");
		money = scanner.nextInt();

		Customer customerOne = new Customer( money );
		
		//choice menu
		while(true) {
			menu();
			menuState = scanner.nextInt();
			
			if( menuState == 1 ) {
				System.out.print("���� �󸶳� ���� �� �Դϱ�?");
				payMoney = scanner.nextInt();	
				if (customerOne.checkMoney(payMoney) == false) {
					System.out.println("������ �ݾ��� �����ϰ� ���� �ʽ��ϴ�.");
					break;
				}
				if( eggMachine.canPossible(payMoney) == true ) {
					eggMachine.getMoneyFromCustomer(payMoney, customerOne);
					eggMachine.sellEgg(customerOne);
					eggMachine.giveRemain(payMoney, customerOne);
				} else {
					System.out.println("\n��� �Ķ��� ǰ��...");
					break;
				}
			} else if ( menuState == 2 ) {
				customerOne.printInfo();
			} else if ( menuState == 3 ) {
				eggMachine.printInfo();
			} else if ( menuState == 4 ) {
				break;
			} else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {

		Market market = new Market();
		market.start();

	}
}
