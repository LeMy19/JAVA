package com.ktds.leinalee;

public class Customer {
	
	private int money;
	
	private int[] beverage = new int[3];

	public void Customer () {
		beverage[0] = 0;  //�ݶ� ����
		beverage[1] = 0;  //��������Ʈ ����
		beverage[2] = 0;  //ȯŸ ����
	}
	

	//���Ǳ⿡�� �� ��� 
	public void spendMoney ( int money ) {
		this.money -= money;
	}
	
	//�ܵ� �޾ƿ���
	public void getChange (int change) {
		this.money += change;
	}
	
	public void buyBeverage ( int coke, int sprite, int soda ) {
		beverage[0] = coke;
		beverage[1] = sprite;
		beverage[2] = soda;
	}
	
	public void printInfo() {
		System.out.println("���� �ݾ� :"+this.money);
		System.out.println("������ �ݶ� :" + beverage[0]);
		System.out.println("������ ��������Ʈ :" + beverage[1]);
		System.out.println("������ ȯŸ :" + beverage[2]);
		
	}
	
}
