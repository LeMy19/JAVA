package com.ktds.leinalee;

public class Customer {
	
	private int money;
	private int eggCount;
	
	public Customer ( int money ) {
		this.money = money;		
	}
	
	//계란 후라이 구매시 내는 금액
	public int pay ( int money ) {
		this.money -= money; //돈을 내고 
		return money;
	}
	
	//계란 후라이를 사는 경우 
	public void getEgg () {
		this.eggCount++;
	}
	
	//거스름 돈을 받는 경우 
	public void getMoney ( int remain ) {
		this.money += remain;
	}
	
	public boolean checkMoney ( int money ) {
		if( this.money < money ) {
			return false;
		}
		return true;
	}
	
	//현재 상태
	public void printInfo() {
		System.out.println("현재 소지 금액 : " + this.money);
		System.out.println("현재 계란 후라이 개수 : " + this.eggCount);
	}
	

}
