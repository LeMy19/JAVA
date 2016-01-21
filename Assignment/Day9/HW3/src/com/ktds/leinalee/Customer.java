package com.ktds.leinalee;

public class Customer {
	
	private int money;
	
	private int[] beverage = new int[3];

	public void Customer () {
		beverage[0] = 0;  //콜라 수량
		beverage[1] = 0;  //스프라이트 수량
		beverage[2] = 0;  //환타 수량
	}
	

	//자판기에서 돈 출력 
	public void spendMoney ( int money ) {
		this.money -= money;
	}
	
	//잔돈 받아오기
	public void getChange (int change) {
		this.money += change;
	}
	
	public void buyBeverage ( int coke, int sprite, int soda ) {
		beverage[0] = coke;
		beverage[1] = sprite;
		beverage[2] = soda;
	}
	
	public void printInfo() {
		System.out.println("남은 금액 :"+this.money);
		System.out.println("소지한 콜라 :" + beverage[0]);
		System.out.println("소지한 스프라이트 :" + beverage[1]);
		System.out.println("소지한 환타 :" + beverage[2]);
		
	}
	
}
