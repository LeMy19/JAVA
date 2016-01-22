package com.ktds.leinalee;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int money;
	private int age;
	private int cigarette;
	
//	��� �� �����ϱ�
	public void payForCigarette ( int money ) {
		this.money -= money;
	}
	
//	�Ž����� �ޱ�
	public void getChange ( int change ) {
		this.money += change;		
	}
	
//	��� �ޱ� cigarette +1
	public void getCigarette ( int selectedCigarette ) {
		this.cigarette += selectedCigarette;
	}
	
//	��� �Ǳ� cigarette -1
	public void isSmoking () {
		if( cigarette >= 1)
			this.cigarette--;
		else 
			System.out.println("��谡 �����ϴ�. �ǿ�� �� �����ϴ�.");
	}
	
//	���� üũ
	public boolean underAgeCheck () {
		if( this.age < 20 ) {
			System.out.println("����� �̼����� �Դϴ�. ��踦 ������ �� �����ϴ�.");
			return false;
		} else 
			return true;
	}
	
//	���� �ݾ� Ȯ���ϱ�
	public boolean moneyCheck( int inputMoneyForCigarette, int selectedCigarette, Customer customer, Store store ) {
		if( inputMoneyForCigarette < store.CIGARETTE_PRICE * selectedCigarette 
				|| inputMoneyForCigarette > this.money ) {
			System.out.println("���� ���� �� ��踦 �� �� �����ϴ�.");
			return false;
		} 
		return true;
	}
	
//	����� ���� �����ϱ�
	public void setInfo(Scanner scanner) {
		System.out.println("\n<<��谡�� �ʱ⼼��ȭ��>>");
		System.out.print("�̸��� �Է��ϼ���:");
		this.name = scanner.next();

		System.out.print("���� �ݾ��� �Է��ϼ���:");
		this.money = scanner.nextInt();
		
		System.out.print("���̸� �Է��ϼ���:");
		this.age = scanner.nextInt();
		
//		������ reset (�缳�� ���)
		this.cigarette = 0;
	}
	
//	����� ���� ���
	public void printInfo() {
		System.out.println("\n<< " + name + "�� ���� ����>>");
		System.out.println("���� ���� �ݾ�: " + this.money);
		System.out.println("������ ��� ����: " + this.cigarette);
		System.out.println( name +"�� ���̴�" +this.age+ "�� �Դϴ�.");
	}
}
