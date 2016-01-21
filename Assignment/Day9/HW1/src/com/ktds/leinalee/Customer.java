package com.ktds.leinalee;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private int money;
	private int age;
	private int cigarette;
	
	public void payForCigarette ( int money ) {
		this.money -= money;
	}
	
	public void getChange ( int change ) {
		this.money += change;		
	}
	
	public void getCigarette () {
		this.cigarette++;
	}
	
	public void isSmoking () {
		if( cigarette > 1)
			this.cigarette--;
		else 
			System.out.println("담배가 없습니다. 피우실 수 없습니다.");
	}
	
	public boolean ageCheck () {
		if( this.age < 20 ) {
			System.out.println("당신은 미성년자 입니다. 담배를 구입할 수 없습니다.");
			return false;
		} else 
			return true;
	}
	
	public boolean moneyCheck( int inputMoney, int selectedCigarette, Customer customer, Store store ) {
		if( inputMoney > store.cigarettePrice * selectedCigarette && inputMoney < this.money ) {
			return true;
		} else 
			return false;
	}
	
	public void setInfo(Scanner scanner) {
		System.out.println("\n<<담배가게 초기세팅화면>>");
		System.out.print("이름을 입력하세요:");
		this.name = scanner.next();
		
		System.out.print("보유 금액을 입력하세요:");
		this.money = scanner.nextInt();
		
		System.out.print("나이를 입력하세요:");
		this.age = scanner.nextInt();
	}
	
	public void printInfo() {
		System.out.println("\n<< " + name + "의 상태 보기>>");
		System.out.println("현재 보유 금액: " + this.money);
		System.out.println("소지한 담배 개수: " + this.cigarette);
		System.out.println( name +"의 나이는" +this.age+ "세 입니다.");
	}
}
