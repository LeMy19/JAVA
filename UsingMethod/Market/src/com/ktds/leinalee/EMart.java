package com.ktds.leinalee;

public class EMart {
	
	public void start () {
		Seller �������1 = new Seller( 50000, 20, 1500 );
		Seller �������2 = new Seller( 5000, 1, 4000);
		Seller �������3 = new Seller(); //�ڹٴ� ������ ������ �ڵ����� �����������, �⺻���� �����ڸ� �������ϱ⶧���� �⺻ ������ �ƴϸ� ��� �Ұ�
		�������3.setAppleCount(10);
		�������3.setApplePrice(500);
		�������3.setMoney(0);
		
		System.out.println(�������1);
		
		/*		�������1.setAppleCount(20);
		�������1.setMoney(50000);
		�������1.setApplePrice(1500);*/
		//���� ��� �ڵ带 �����ڷ� ���� �� �ִ�. 
		
		Customer ������ = new Customer();
		������.setMoney(60000);
		������.setAppleCount(0);
		
		�������1.getMoneyFromCustomer(3000, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		�������1.giveApple(1, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		�������1.giveRemain(3000, 1, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		�������2.getMoneyFromCustomer(5000, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		�������2.giveApple(1, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		�������2.giveRemain(3000, 1, ������);
		�������1.printMyInfo();
		������.printMyInfo();
		
		
	}

	public static void main(String[] args) {
		EMart mart = new EMart();
		mart.start();

	}
}
