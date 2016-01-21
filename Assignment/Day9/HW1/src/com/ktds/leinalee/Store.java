package com.ktds.leinalee;

public class Store {
	final static int cigarettePrice = 4000;
	
	private int cigaretteCount = 50;
	private int money = 10000;
	private int selectedCigarette;
	
	public void getMoney(int money, Customer customer) {
		System.out.println("담배를 구입하셨습니다.");
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
		System.out.println("\n<<담배 가게 현황 보기>>");
		System.out.println("현재 보유 금액: " + this.money);
		System.out.println("담배 재고 개수: " + this.cigaretteCount);
		System.out.println("담배는 " +this.cigarettePrice+ "원 입니다.");
	}
	
}
