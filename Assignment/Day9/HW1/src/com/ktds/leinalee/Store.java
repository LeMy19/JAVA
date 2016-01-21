package com.ktds.leinalee;

public class Store {
	final static int cigarettePrice = 4000;
	
	private int cigaretteCount = 5;
	private int money = 10000;
	private int selectedCigarette;
	
	public void getMoney(int money, int selectedCigarette, Customer customer, Store store) {
		System.out.println("��踦 �����ϼ̽��ϴ�.");
		this.money += money; 
		customer.payForCigarette(money, selectedCigarette);		
	}

	public void giveChange (int money, int selectedCigarette, Customer customer ) {
		int change;
		change = money - this.cigarettePrice * selectedCigarette;
		this.money -= change;
		customer.getChange(change);
	}
	
	public void giveCigarette (Customer customer, int selectedCigarette) {
		this.cigaretteCount -= selectedCigarette;
		customer.getCigarette(selectedCigarette);
	}
	
	public boolean checkCigarette ( int selectedCigarette ) {
		if( this.cigaretteCount < selectedCigarette ) {
			System.out.println("��� �����ؼ� �� �� �����ϴ�.");
			return false;
		} else 
			return true;
		
	}
	public void printInfo() {
		System.out.println("\n<<��� ���� ��Ȳ ����>>");
		System.out.println("���� ���� �ݾ�: " + this.money);
		System.out.println("��� ��� ����: " + this.cigaretteCount);
		System.out.println("���� " +this.cigarettePrice+ "�� �Դϴ�.");
	}
	
}
