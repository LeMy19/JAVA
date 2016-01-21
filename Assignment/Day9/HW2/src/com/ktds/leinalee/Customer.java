package com.ktds.leinalee;

public class Customer {
	
	private int money;
	private int eggCount;
	
	public Customer ( int money ) {
		this.money = money;		
	}
	
	//��� �Ķ��� ���Ž� ���� �ݾ�
	public int pay ( int money ) {
		this.money -= money; //���� ���� 
		return money;
	}
	
	//��� �Ķ��̸� ��� ��� 
	public void getEgg () {
		this.eggCount++;
	}
	
	//�Ž��� ���� �޴� ��� 
	public void getMoney ( int remain ) {
		this.money += remain;
	}
	
	public boolean checkMoney ( int money ) {
		if( this.money < money ) {
			return false;
		}
		return true;
	}
	
	//���� ����
	public void printInfo() {
		System.out.println("���� ���� �ݾ� : " + this.money);
		System.out.println("���� ��� �Ķ��� ���� : " + this.eggCount);
	}
	

}
