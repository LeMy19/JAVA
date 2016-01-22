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
		
		System.out.println("���� �־��ּ���.");
		customer.setMoney(scanner.nextInt());
		
//		���� ����
		int customerMoney;
		int quantity; 
		int drinkNumber;
		
//		program start!!
		while(true) {
			
//			������� �� Ȯ�� 
			if ( customer.getMoney() <= 0 ) {
				break;
			}
				
//			�޴� ��� 
			machine.printMenu();
			
//			������� �� setting
			System.out.println("���� �־��ּ���.");
			customerMoney = scanner.nextInt();
			if ( !machine.getMoney(customerMoney, customer) ) {
				System.out.println("���� �����մϴ�.");
				break;
			}
			
//			drinkNumber(����� ����), quantity(����� ����), Customer
			System.out.println("����� ������ �Է��ϼ���.");
			drinkNumber = scanner.nextInt();
			System.out.println("����� ������ �Է��ϼ���.");
			quantity = scanner.nextInt();
			
			machine.giveDrink(drinkNumber, quantity, customer);
			
//			customer Infomation print
			customer.printInfo();
			
//			��� �ð� ���߱�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
