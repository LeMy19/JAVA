package com.ktds.leinalee;

public class VendingMachine {
	
	private int money;
	private int[][] beverage = new int[3][2];

	public void VendigMachine () {
	
		beverage[0][0] = 15; //콜라 수량
		beverage[0][1] = 1500; //콜라 가격
		
		beverage[1][0] = 15;  //스프라이트 수량
		beverage[1][1] = 1000;  //스프라이트 가격
		
		beverage[2][0] = 5;   //환타 수량
		beverage[2][1] = 800;   //환타 가격

	}
	
	//소비자에게 받은 돈 증가시키기
	public int earnMoney ( int money, Customer cusomter ) {
		this.money += money;
		cusomter.spendMoney(money);
		return money;
	}
	
	//잔돈 정산하기
	public void giveChange ( int money, int[] beverage, Customer customer  ) {
		int total = 0;
		for(int i = 0; i < 3 ; i ++) {
			total = this.beverage[i][1] * beverage[i];
		}
		this.money -= total;
		customer.getChange(total);
		
	}
	
	
	
	//자판기 음료수 정산하기
	public void sellBeverage ( int[] beverage, Customer customer ) {
		for(int i = 0; i < 3 ; i ++) {
			this.beverage[i][0] -= beverage[i];
		}
	}
	
	//자판기 정보 출력
	public void printInfo() {
		System.out.println("콜라, 스트라이트, 환타의 남은 수량은 ");
		for(int i=0; i<3; i++) {	
			System.out.println(beverage[i][0]);
		}
	}

}
