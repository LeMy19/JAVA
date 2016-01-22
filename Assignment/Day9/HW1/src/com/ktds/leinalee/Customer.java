package com.ktds.leinalee;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int money;
	private int age;
	private int cigarette;
	
//	담배 값 지불하기
	public void payForCigarette ( int money ) {
		this.money -= money;
	}
	
//	거스름돈 받기
	public void getChange ( int change ) {
		this.money += change;		
	}
	
//	담배 받기 cigarette +1
	public void getCigarette ( int selectedCigarette ) {
		this.cigarette += selectedCigarette;
	}
	
//	담배 피기 cigarette -1
	public void isSmoking () {
		if( cigarette >= 1)
			this.cigarette--;
		else 
			System.out.println("담배가 없습니다. 피우실 수 없습니다.");
	}
	
//	나이 체크
	public boolean underAgeCheck () {
		if( this.age < 20 ) {
			System.out.println("당신은 미성년자 입니다. 담배를 구입할 수 없습니다.");
			return false;
		} else 
			return true;
	}
	
//	소지 금액 확인하기
	public boolean moneyCheck( int inputMoneyForCigarette, int selectedCigarette, Customer customer, Store store ) {
		if( inputMoneyForCigarette < store.CIGARETTE_PRICE * selectedCigarette 
				|| inputMoneyForCigarette > this.money ) {
			System.out.println("금전 관계 상 담배를 살 수 없습니다.");
			return false;
		} 
		return true;
	}
	
//	사용자 정보 세팅하기
	public void setInfo(Scanner scanner) {
		System.out.println("\n<<담배가게 초기세팅화면>>");
		System.out.print("이름을 입력하세요:");
		this.name = scanner.next();

		System.out.print("보유 금액을 입력하세요:");
		this.money = scanner.nextInt();
		
		System.out.print("나이를 입력하세요:");
		this.age = scanner.nextInt();
		
//		담배수량 reset (재설정 경우)
		this.cigarette = 0;
	}
	
//	사용자 정보 출력
	public void printInfo() {
		System.out.println("\n<< " + name + "의 상태 보기>>");
		System.out.println("현재 보유 금액: " + this.money);
		System.out.println("소지한 담배 개수: " + this.cigarette);
		System.out.println( name +"의 나이는" +this.age+ "세 입니다.");
	}
}
