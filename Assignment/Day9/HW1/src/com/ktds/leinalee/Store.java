package com.ktds.leinalee;

public class Store {
	final static int cigarettePrice = 4000;
	
	private int cigaretteCount = 50;
	private int money = 10000;
	private int selectedCigarette;
	
	public void getMoney(int money, Customer customer) {
		System.out.println("��踦 �����ϼ̽��ϴ�.");
		this.money += money; 
		customer.payForCigarette(money);		
	}

	public void giveChange (int money, int selectedCigarette, Customer customer ) {
		int change;
		change = money - this.cigarettePrice;
		customer.getChange(change);
	}
	
	public void giveCigarette (Customer customer) {
		this.cigaretteCount--;
		customer.getCigarette();
	}
	
	public void printInfo() {
		System.out.println("\n<<��� ���� ��Ȳ ����>>");
		System.out.println("���� ���� �ݾ�: " + this.money);
		System.out.println("��� ��� ����: " + this.cigaretteCount);
		System.out.println("���� " +this.cigarettePrice+ "�� �Դϴ�.");
	}
	
}
