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
	
//	���� �ش� 
	public void pay( int money ) {
		this.money -= money;
		//return money;
	}
	
//	���Ḧ �޴´� 
	public void addCola( int quantity ) {
		this.setColaQuantity( this.colaQuantity + quantity );
	}

	public void addSprite( int quantity ) {
		this.setSpriteQuantity(this.spriteQuantity + quantity);
	}
	
	public void addFanta( int quantity ) {
		this.setFantaQuantity(this.fantaQuantity + quantity);
	}
	
//	�Ž������� �޴´�
	public void getRaminMoney( int money ) {
		this.money += money;
	}

//	������ ���
	public void printInfo() {
		System.out.println("�����ڰ� ���� �� :" + this.getMoney());
		System.out.println("�����ڰ� ������ �ݶ� :" +this.getColaQuantity());
		System.out.println("�����ڰ� ������ ��������Ʈ :" +this.getSpriteQuantity());
		System.out.println("�����ڰ� ������ ȯŸ :" + this.getFantaQuantity());
	}
	
}
