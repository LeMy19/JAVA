package com.ktds.leinalee;

public class EMart {
	
	public void start () {
		Seller 과일장수1 = new Seller( 50000, 20, 1500 );
		Seller 과일장수2 = new Seller( 5000, 1, 4000);
		Seller 과일장수3 = new Seller(); //자바는 만들이 않으면 자동으로 만들어주지만, 기본으로 생성자를 만들어야하기때문에 기본 세팅이 아니면 사용 불가
		과일장수3.setAppleCount(10);
		과일장수3.setApplePrice(500);
		과일장수3.setMoney(0);
		
		System.out.println(과일장수1);
		
		/*		과일장수1.setAppleCount(20);
		과일장수1.setMoney(50000);
		과일장수1.setApplePrice(1500);*/
		//위의 모든 코드를 생성자로 줄일 수 있다. 
		
		Customer 백지경 = new Customer();
		백지경.setMoney(60000);
		백지경.setAppleCount(0);
		
		과일장수1.getMoneyFromCustomer(3000, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		과일장수1.giveApple(1, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		과일장수1.giveRemain(3000, 1, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		과일장수2.getMoneyFromCustomer(5000, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		과일장수2.giveApple(1, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		과일장수2.giveRemain(3000, 1, 백지경);
		과일장수1.printMyInfo();
		백지경.printMyInfo();
		
		
	}

	public static void main(String[] args) {
		EMart mart = new EMart();
		mart.start();

	}
}
