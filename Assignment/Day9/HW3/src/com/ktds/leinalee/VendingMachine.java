package com.ktds.leinalee;

public class VendingMachine {
	
	private int money;
	private int[][] beverage = new int[3][2];

	public void VendigMachine () {
	
		beverage[0][0] = 15; //�ݶ� ����
		beverage[0][1] = 1500; //�ݶ� ����
		
		beverage[1][0] = 15;  //��������Ʈ ����
		beverage[1][1] = 1000;  //��������Ʈ ����
		
		beverage[2][0] = 5;   //ȯŸ ����
		beverage[2][1] = 800;   //ȯŸ ����

	}
	
	//�Һ��ڿ��� ���� �� ������Ű��
	public int earnMoney ( int money, Customer cusomter ) {
		this.money += money;
		cusomter.spendMoney(money);
		return money;
	}
	
	//�ܵ� �����ϱ�
	public void giveChange ( int money, int[] beverage, Customer customer  ) {
		int total = 0;
		for(int i = 0; i < 3 ; i ++) {
			total = this.beverage[i][1] * beverage[i];
		}
		this.money -= total;
		customer.getChange(total);
		
	}
	
	
	
	//���Ǳ� ����� �����ϱ�
	public void sellBeverage ( int[] beverage, Customer customer ) {
		for(int i = 0; i < 3 ; i ++) {
			this.beverage[i][0] -= beverage[i];
		}
	}
	
	//���Ǳ� ���� ���
	public void printInfo() {
		System.out.println("�ݶ�, ��Ʈ����Ʈ, ȯŸ�� ���� ������ ");
		for(int i=0; i<3; i++) {	
			System.out.println(beverage[i][0]);
		}
	}

}
