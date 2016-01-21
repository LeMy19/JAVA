package com.ktds.leinalee;

public class VendingMachine {
	
	private int eggCount = 3;
	private int eggPrice = 1000;
	private int money = 0;
	
	//�Һ��ڰ� ��� �Ķ��̸� ��� ���� �����ϴ� �ݾ� + customer.pay 
	public void getMoneyFromCustomer ( int money , Customer customer ) {
		this.money += customer.pay(money);
	}
	
	//��� �Ķ��� ����� �ȱ� + customer getEgg
	public void sellEgg (Customer customer) {
		this.eggCount -= 1;
		customer.getEgg();
	}
	
	//�Ž����� ��� + customer.getMoney
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

	
	//���� ���� ���� 
	public void printInfo() {
		System.out.println("���� ��� ���� : " + this.eggCount);
		System.out.println("��� �Ķ��� �ݾ� : " + this.eggPrice);
		System.out.println("������� �� �ݾ� : " + this.money);
	}
	

}
