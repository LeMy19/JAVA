package com.ktds.leinalee;

public class Seller {
	
	private int money;
	private int appleCount;
	private int applePrice;


	/*
	 * 메소드의 파라미터 개수가 다른 경우
	 * 메소드의 파라미터 종류가 다른 경우
	 * 를 메소드 오버로딩 이라 부른다.
	 */
	
	public Seller () {
		
	}
	
	//기본 생성자 
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
		//this.money += 김광민.pay();
		this.money += customer.pay(money);
	}
	
	public void giveApple( int appleCount , Customer customer) {
		this.appleCount -= appleCount;
		customer.getApple(appleCount);
	}
	
	//거스름돈 계산하고 주고 받는 메소드
	public void giveRemain( int money, int appleCount, Customer customer ) {
		int remain = money - (appleCount * this.applePrice);
		this.money -= remain;
		customer.takeMoney(remain);
	}
	
	public void printMyInfo() {
		System.out.println("판매자가 가진 사과의 수 : " + this.appleCount);
		System.out.println("판매자가 가진 금액 : " + this.money);
	}
}
