package com.ktds.leinalee;

public class Seller {
	
	private int money;
	private int appleCount;
	private int applePrice;


	/*
	 * �޼ҵ��� �Ķ���� ������ �ٸ� ���
	 * �޼ҵ��� �Ķ���� ������ �ٸ� ���
	 * �� �޼ҵ� �����ε� �̶� �θ���.
	 */
	
	public Seller () {
		
	}
	
	//�⺻ ������ 
	public Seller( int money, int appleCount, int applePrice ) {
		this.setMoney(money);
		this.setAppleCount(appleCount);
		this.setApplePrice(applePrice);
	}
	
	public int getMoney ( long money, String money2 ) {
		return 0;
	}
	
	public int getMoney( int money ) {
		return 0;
	}
	
	public int getMoney( long money ) {
		return 0;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getAppleCount() {
		return appleCount;
	}
	
	public void setAppleCount(int appleCount) {
		this.appleCount = appleCount;
	}
	
	public int getApplePrice() {
		return applePrice;
	}
	
	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
	}
	
	public void getMoneyFromCustomer( int money, Customer customer ) {
		//this.money += money;
		//this.money += �豤��.pay();
		this.money += customer.pay(money);
	}
	
	public void giveApple( int appleCount , Customer customer) {
		this.appleCount -= appleCount;
		customer.getApple(appleCount);
	}
	
	//�Ž����� ����ϰ� �ְ� �޴� �޼ҵ�
	public void giveRemain( int money, int appleCount, Customer customer ) {
		int remain = money - (appleCount * this.applePrice);
		this.money -= remain;
		customer.takeMoney(remain);
	}
	
	public void printMyInfo() {
		System.out.println("�Ǹ��ڰ� ���� ����� �� : " + this.appleCount);
		System.out.println("�Ǹ��ڰ� ���� �ݾ� : " + this.money);
	}
}
