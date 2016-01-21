package com.ktds.leinalee;

public class Store {
	final static int cigarettePrice = 4000;
	
	private int cigaretteCount = 5;
	private int money = 10000;
	private int selectedCigarette;
	
	public void getMoney(int money, int selectedCigarette, Customer customer, Store store) {
		System.out.println("담배를 구입하셨습니다.");
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
			System.out.println("재고가 부족해서 살 수 없습니다.");
			return false;
		} else 
			return true;
		
	}
	public void printInfo() {
		System.out.println("\n<<담배 가게 현황 보기>>");
		System.out.println("현재 보유 금액: " + this.money);
		System.out.println("담배 재고 개수: " + this.cigaretteCount);
		System.out.println("담배는 " +this.cigarettePrice+ "원 입니다.");
	}
	
}
