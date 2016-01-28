package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class BankBiz {
	
//	클래스 변수 필드
	public static final long MAX_LIMIT = 100000000;
	public static final float RATE = 1.1f;
	
//	인스턴스 변수 필드
	private int bankAmount;
	private int flag;
	private List<CustomerInfoVO> customerInfo;
	
	private InputPackage input;
	private CheckTime checkTime;
	
//	private LoanCash 
	private LoanCash menu1;
	private PaybackCash menu2;
	private Bankrupt menu3;
	private ShowStatus menu4;
	
//	Getter & Setter
	public List<CustomerInfoVO> getCustomerInfo() {
		return customerInfo;
	}
	
	public void setCustomerInfo(List<CustomerInfoVO> customerInfo) {
		this.customerInfo = customerInfo;
	}

	public int getBankAmount() {
		return bankAmount;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public void setBankAmount(int bankAmount) {
		this.bankAmount = bankAmount;
	}

//	생성자
	public BankBiz () {
		System.out.println("<대출 이자(복리) 계산기>");
		System.out.println("=========================");
		this.setBankAmount(1000000000);
		customerInfo = new ArrayList<CustomerInfoVO>();
		input = new InputPackage();
		checkTime = new CheckTime();
		
		menu1 = new LoanCash();
		menu2 = new PaybackCash();
		menu3 = new Bankrupt();
		menu4 = new ShowStatus();
	}
	
//	method 
	public void program () {
		
		while(true) {
			this.menu();
			
			if ( this.getFlag() == 1 ) {
				menu1.loanCashMenu();
				menu1.loanCash(input, checkTime, this);
			} 
			else if ( this.getFlag() == 2 ) {
				menu2.payBackMenu();
				menu2.payBack(input, this, checkTime);
			} 
			else if ( this.getFlag() == 3 ) {
				menu3.preCheck(input, this);
			} 
			else if ( this.getFlag() == 4 ) {
				menu4.showMyStatus(input, this);
			} 
			else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		}
	}

	public void menu () {
		System.out.println("1. 대출");
		System.out.println("2. 상환");
		System.out.println("3. 파산신청");
		System.out.println("4. 상태보기");
		System.out.println("종료 : exit");
		this.setFlag(this.input.inputMainMenu());
	}
	
	public CustomerInfoVO nameCheck (String tempName) {
		for ( CustomerInfoVO tempInfo : this.getCustomerInfo() ) {
			if ( tempInfo.getName().equals(tempName) ) {
				return tempInfo;
			}
		}
		return new CustomerInfoVO();
	}	
}
