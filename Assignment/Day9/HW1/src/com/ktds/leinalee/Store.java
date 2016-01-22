package com.ktds.leinalee;

public class Store {
	final static int CIGARETTE_PRICE = 4000;
	
	/*
	 * ����� ������ �͵��� �ʱ�ȭ���Ǹ� �ȵȴ�.
	 * 
	 */
	private int cigaretteCount = 5;
	private int money = 10000;
	private int selectedCigarette;
	
//	�ִ� ��� ���� ������ֱ� 
	public void computeMoney (int inputMoney ) {
		int number;
		number = inputMoney / this.CIGARETTE_PRICE;
		System.out.println("�ִ� " + number + "�� �� �� �ֽ��ϴ�.");	
	}
	
//	�Һ��ڿ��� �� �ޱ�
	public void getMoney(int money, Customer customer) {
		System.out.println("��踦 �����ϼ̽��ϴ�.");
		this.money += money; 
		customer.payForCigarette(money);		
	}

//	��谪 ����ϰ� �Ž����� �ֱ�
	public void giveChange (int money, int selectedCigarette, Customer customer ) {
		int change;
		change = money - this.CIGARETTE_PRICE * selectedCigarette;
		this.money -= change;
		customer.getChange(change);
	}
	
//	�Һ��ڿ��� ��� �����ϱ�
	public void giveCigarette (Customer customer, int selectedCigarette) {
		this.cigaretteCount -= selectedCigarette;
		customer.getCigarette(selectedCigarette);
	}
	
//	������ Ȯ���ϱ�
	public boolean checkCigarette ( int selectedCigarette ) {
		if( this.cigaretteCount < selectedCigarette ) {
			System.out.println("��� �����ؼ� �� �� �����ϴ�.");
			return false;
		} else 
			return true;
		
	}
	
//	��谡�� ��Ȳ ���
	public void printInfo() {
		System.out.println("\n<<��� ���� ��Ȳ ����>>");
		System.out.println("���� ���� �ݾ�: " + this.money);
		System.out.println("��� ��� ����: " + this.cigaretteCount);
		System.out.println("��� ����: " + this.CIGARETTE_PRICE + "��");
	}
	
}
