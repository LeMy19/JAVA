package com.ktds.leinalee;

public class VendingMachine {
	
	private int eggCount = 3;
	private int eggPrice = 1000;
	private int money = 0;
	
	//소비자가 계란 후라이를 사기 위해 제시하는 금액 + customer.pay 
	public void getMoneyFromCustomer ( int money , Customer customer ) {
		this.money += customer.pay(money);
	}
	
	//계란 후라이 만들어 팔기 + customer getEgg
	public void sellEgg (Customer customer) {
		this.eggCount -= 1;
		customer.getEgg();
	}
	
	//거스름돈 계산 + customer.getMoney
	public void giveRemain ( int money, Customer customer ) {
		int remain;
		
		remain = money - this.eggPrice;
		this.money -= remain;
		
		customer.getMoney(remain);
	}
	
	public boolean canPossible ( ) {
		if(this.eggCount < 1)
			return false;
		return true;
	}

	
	//현재 상태 정보 
	public void printInfo() {
		System.out.println("현재 계란 개수 : " + this.eggCount);
		System.out.println("계란 후라이 금액 : " + this.eggPrice);
		System.out.println("현재까지 판 금액 : " + this.money);
	}
	

}
