package com.ktds.leinalee;

public class Store {
	final static int CIGARETTE_PRICE = 4000;
	
	/*
	 * 상수를 제외한 것들을 초기화가되면 안된다.
	 * 
	 */
	private int cigaretteCount = 5;
	private int money = 10000;
	private int selectedCigarette;
	
//	최대 담배 개수 계산해주기 
	public void computeMoney (int inputMoney ) {
		int number;
		number = inputMoney / this.CIGARETTE_PRICE;
		System.out.println("최대 " + number + "개 살 수 있습니다.");	
	}
	
//	소비자에게 돈 받기
	public void getMoney(int money, Customer customer) {
		System.out.println("담배를 구입하셨습니다.");
		this.money += money; 
		customer.payForCigarette(money);		
	}

//	담배값 계산하고 거스름돈 주기
	public void giveChange (int money, int selectedCigarette, Customer customer ) {
		int change;
		change = money - this.CIGARETTE_PRICE * selectedCigarette;
		this.money -= change;
		customer.getChange(change);
	}
	
//	소비자에게 담배 전달하기
	public void giveCigarette (Customer customer, int selectedCigarette) {
		this.cigaretteCount -= selectedCigarette;
		customer.getCigarette(selectedCigarette);
	}
	
//	담배재고 확인하기
	public boolean checkCigarette ( int selectedCigarette ) {
		if( this.cigaretteCount < selectedCigarette ) {
			System.out.println("재고가 부족해서 살 수 없습니다.");
			return false;
		} else 
			return true;
		
	}
	
//	담배가게 현황 출력
	public void printInfo() {
		System.out.println("\n<<담배 가게 현황 보기>>");
		System.out.println("현재 보유 금액: " + this.money);
		System.out.println("담배 재고 개수: " + this.cigaretteCount);
		System.out.println("담배 가격: " + this.CIGARETTE_PRICE + "원");
	}
	
}
