package com.ktds.leinalee;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int money;
	private int age;
	private int cigarette;
	
	public void payForCigarette ( int money ) {
		this.money -= money;
	}
	
	public void getChange ( int change ) {
		this.money += change;		
	}
	
	public void getCigarette () {
		this.cigarette++;
	}
	
	public void isSmoking () {
		if( cigarette > 1)
			this.cigarette--;
		else 
			System.out.println("��谡 �����ϴ�. �ǿ�� �� �����ϴ�.");
	}
	
	public boolean ageCheck () {
		if( this.age < 20 ) {
			System.out.println("����� �̼����� �Դϴ�. ��踦 ������ �� �����ϴ�.");
			return false;
		} else 
			return true;
	}
	
	public boolean moneyCheck( int inputMoney, int selectedCigarette, Customer customer, Store store ) {
		if( inputMoney > store.cigarettePrice * selectedCigarette && inputMoney < this.money ) {
			return true;
		} else 
			return false;
	}
	
	public void setInfo(Scanner scanner) {
		System.out.println("\n<<��谡�� �ʱ⼼��ȭ��>>");
		System.out.print("�̸��� �Է��ϼ���:");
		this.name = scanner.next();
		
		System.out.print("���� �ݾ��� �Է��ϼ���:");
		this.money = scanner.nextInt();
		
		System.out.print("���̸� �Է��ϼ���:");
		this.age = scanner.nextInt();
	}
	
	public void printInfo() {
		System.out.println("\n<< " + name + "�� ���� ����>>");
		System.out.println("���� ���� �ݾ�: " + this.money);
		System.out.println("������ ��� ����: " + this.cigarette);
		System.out.println( name +"�� ���̴�" +this.age+ "�� �Դϴ�.");
	}
}
