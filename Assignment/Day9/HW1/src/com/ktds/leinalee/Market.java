package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	/**
	 * ��谡�� �޴�
	 */
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
				
//		�Һ��� ���� 
		int menu;
		int age;
		int inputMoneyForCigarette;
		int selectedCigarette;
		
//		���ǹ� üũ�� �� �ʿ��� ���� 
		boolean checkAge = true;
		boolean checkMoney = true;
		boolean checkCigaretteCount = true;
		String goHome;
		
//		�ν��Ͻ� ���� 
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		Store store = new Store();	
			
//		program start! 
		System.out.println("<<��谡�Կ� ���� ���� ȯ���մϴ�>>");
//		�ʱ� ���� ����
		customer.setInfo(scanner);

//		�ݺ�
		while (true) {
			showMenu();
			menu = scanner.nextInt();

//			����Ȯ�� �ϱ� 
			checkAge = customer.underAgeCheck();
	
//			�����
			if ( menu == 1 && checkAge ) {
				System.out.println("���� ��� ����:"+store.CIGARETTE_PRICE);
				System.out.print("���� ��������:");
				inputMoneyForCigarette = scanner.nextInt();
				
				System.out.print("��踦 � ���� ���ϼ���:");
				store.computeMoney(inputMoneyForCigarette);
				selectedCigarette = scanner.nextInt();				
				
//				���Ȯ�� 
				checkCigaretteCount = store.checkCigarette(selectedCigarette);
				
//				�Һ��� �� Ȯ��
				checkMoney = customer.moneyCheck(inputMoneyForCigarette, selectedCigarette, customer, store);

				if ( !checkCigaretteCount || !checkMoney ) {
					System.out.print("������ ���ðڽ��ϱ�? y/n :");
					goHome = scanner.next();
					if(goHome.equalsIgnoreCase("y")) {
						break;
					} else 
						continue;
				}
				
//				��� �Ǹ� ���� Ȯ��  
				store.getMoney(inputMoneyForCigarette, customer);
				store.giveChange(inputMoneyForCigarette, selectedCigarette, customer);
				store.giveCigarette(customer, selectedCigarette);
//			2. ������Ȯ��
			} else if ( menu == 2 ) { 
				customer.printInfo();
//			3. ���� ��� Ȯ��	
			} else if ( menu == 3) { 
				store.printInfo();
//			4. ����Ǳ�
			} else if ( menu == 4 ) { 
				customer.isSmoking();
//			5. ������ (����)
			} else if ( menu == 5 ) { 
				System.out.println("��谡�Ը� ����ϴ�... �ȳ���������!");
				break;
//			6. �ʱ���� ���� (����, �̸�)
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
