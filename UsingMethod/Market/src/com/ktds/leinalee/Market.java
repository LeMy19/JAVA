package com.ktds.leinalee;

public class Market {
	
	private int appleCount = 15;
	private int money = 4000;
	public static final int APPLE_PRICE = 500; // ���
	
	// ��¥ ������ start�� ��
	public void start(){
		
		Customer �豤�� = new Customer();
		�豤��.setMoney(5300);
		�豤��.setAppleCount(0);
		
		while ( true) {
		
			if ( this.appleCount == 0 || �豤��.getMoney() < Market.APPLE_PRICE ) {
				System.out.println("�� �Ⱦƿ�.");
				break;
			}
			
			// �Һ��ڿ��� ���� �޴´�.
			�豤��.pay(1000);
			this.money += 1000;
			
			// �Һ��ڿ��� ����� �ش�.
			this.appleCount -= 1;
			�豤��.getApple(1);
			
			// �Ž������� ���� �ش�.
			int money = 1000 - ( Market.APPLE_PRICE * 1 );
			this.money -= money;
			�豤��.takeMoney(money);
			
			// �Һ����� ������ ����Ѵ�.
			�豤��.printMyInfo();
		}
		
	}
	
	// ������ ���ι��� �̷��� ����
	// ������ ���� ������
	public static void main(String[] args){
		
		Market market = new Market();
		market.start();
		
	}

}
