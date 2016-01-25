package com.ktds.leinalee;

public class People {
	
	private int money;
	
	private int colaQuantity;
	private int spriteQuantity;
	private int fantaQuantity;
	
//	setter & getter
	public int getColaQuantity() {
		return colaQuantity;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setColaQuantity(int colaQuantity) {
		this.colaQuantity = colaQuantity;
	}
	public int getSpriteQuantity() {
		return spriteQuantity;
	}
	public void setSpriteQuantity(int spriteQuantity) {
		this.spriteQuantity = spriteQuantity;
	}
	public int getFantaQuantity() {
		return fantaQuantity;
	}
	public void setFantaQuantity(int fantaQuantity) {
		this.fantaQuantity = fantaQuantity;
	}
	
//	method 
	
//	돈을 준다 
	public void pay( int money ) {
		this.money -= money;
		//return money;
	}
	
//	음료를 받는다 
	public void addCola( int quantity ) {
		this.setColaQuantity( this.colaQuantity + quantity );
	}

	public void addSprite( int quantity ) {
		this.setSpriteQuantity(this.spriteQuantity + quantity);
	}
	
	public void addFanta( int quantity ) {
		this.setFantaQuantity(this.fantaQuantity + quantity);
	}
	
//	거스름돈을 받는다
	public void getRaminMoney( int money ) {
		this.money += money;
	}

//	내상태 출력
	public void printInfo() {
		System.out.println("구매자가 가진 돈 :" + this.getMoney());
		System.out.println("구매자가 구입한 콜라 :" +this.getColaQuantity());
		System.out.println("구매자가 구입한 스프라이트 :" +this.getSpriteQuantity());
		System.out.println("구매자가 구입한 환타 :" + this.getFantaQuantity());
	}
	
}
