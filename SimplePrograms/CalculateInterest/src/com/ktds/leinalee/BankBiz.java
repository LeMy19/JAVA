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
		customerInfo = new ArrayList<CustomerInfoVO>();
		input = new InputPackage();
		checkTime = new CheckTime();
		
		menu4 = new ShowStatus();
	}
	
//	method 
	public void program () {
		
		while(true) {
			this.menu();
			
			if ( this.getFlag() == 1 ) {
				this.loanCashMenu();
				this.loanCash();
			} 
			else if ( this.getFlag() == 2 ) {
				this.payBackMenu();
				this.payBack();
			} 
			else if ( this.getFlag() == 3 ) {
				this.preCheck();
			} 
			else if ( this.getFlag() == 4 ) {
//				this.showMyStatus();
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
	
	
	/**
	 * menu1. 대출
	 */
	public void loanCashMenu () {
		System.out.println("<대출>");
		System.out.println("아래 사항을 차례로 입력하시오.");
		System.out.println("1. 이름 2. 전화번호 3. 대출금액 4. 담보 5. 소지금액");
	}
	
	public void loanCash () {
		CustomerInfoVO tempInfo = new CustomerInfoVO();
		
		tempInfo.setName(input.inputString());
		tempInfo.setPhoneNumber(input.inputString());
		tempInfo.setLoanAmount(input.inputInt());
//		대출가능한지 체크 (한도초과)
		if ( canLoanCash (tempInfo.getLoanAmount()) ) {
			tempInfo.setGuarantee(input.inputString());
			tempInfo.setOwnCash(input.inputLong());
			tempInfo.setLoanDate(checkTime.timeCheck());
			
			this.getCustomerInfo().add(tempInfo);
			System.out.print("담보 " + tempInfo.getGuarantee() + "로 ");
			System.out.println(tempInfo.getLoanAmount() + "원 대출 완료");
//			소지금액 갱신
			long ownCash = tempInfo.getOwnCash();
			tempInfo.setOwnCash(ownCash + tempInfo.getLoanAmount());
			System.out.println("---------------------------------------");
			
			this.getCustomerInfo().add(tempInfo);
		}
		else
		{
			System.out.println("빌릴 수 있는 금액을 초과했습니다.");
		}
	}
	
	public boolean canLoanCash (long loanAmount) {
		if ( loanAmount < BankBiz.MAX_LIMIT ) {
			return true;
		}
		return false;
	}
	
	/**
	 * menu2 상환
	 */
	public void payBackMenu () {
		System.out.println("<상환>");
		System.out.println("대출인 이름을 입력하세요.");
	}
	
	public void payBack () {
		String tempName = input.inputString();
		CustomerInfoVO tempInfo = this.nameCheck(tempName);
		
//		대출한 이름인지 확인
		if ( tempInfo.getName() != null) {
//			대출가능한 돈을 소유하는지 체크
			if ( this.canPayBack(tempInfo) ) {
				System.out.println("돈을 상환합니다.");
				tempInfo.setLoanAmount(0);
				long ownCash = tempInfo.getOwnCash();
				tempInfo.setOwnCash(ownCash - tempInfo.getPayBackMoney());
			}
			else {
				System.out.println("현재 돈으로 갚을 수 없습니다.");
				this.preCheck();
			}
		}
		else {
			System.out.println("없는 이름입니다.");
		}
		
	}
	
	public CustomerInfoVO nameCheck (String tempName) {
		for ( CustomerInfoVO tempInfo : this.getCustomerInfo() ) {
			if ( tempInfo.getName().equals(tempName) ) {
				return tempInfo;
			}
		}
		return new CustomerInfoVO();
	}
	
//	계산할 수 있는지 체크하기
	public boolean canPayBack(CustomerInfoVO tempInfo) {
		checkTime.timeCheck();
		int currentTime = this.checkTime.timeCheck();
		int totalRentTime = this.checkTime.totalRentalTime(tempInfo.getLoanDate(), currentTime);
		tempInfo.setTotalRentTime(totalRentTime);
		if ( this.calculateInterest(totalRentTime, tempInfo) < tempInfo.getOwnCash() ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
//	이자(복리) 계산하기
	public int calculateInterest (int nTime, CustomerInfoVO tempInfo) {
		int time = Math.round(nTime/10);
		double rate = Math.pow(RATE, time);
		int total =  (int) Math.round(tempInfo.getLoanAmount() * rate);
		tempInfo.setPayBackMoney(total);
		System.out.println("당신이 갚아야할 돈은 " + tempInfo.getPayBackMoney() + "원 입니다.");
		return total;
	}
	
	/**
	 * menu3 파산
	 */
	public void preCheck () {
		System.out.println("정말로 파산하시겠습니까? Y/N");
		if ( input.inputPreCheck() ) {
			this.bankrupt();
		}
	}
	
	public void bankrupt () {
		CustomerInfoVO info = new CustomerInfoVO();
		System.out.println("이름을 입력하세요.");
		String tempName = this.input.inputString();
		info = this.nameCheck(tempName);
		
		if ( info.getName() != null ) {
			this.getCustomerInfo().remove(info);
			System.out.println("파산하였습니다.");
		}
		else {
			System.out.println("이름이 정확하지 않습니다.");
		}
	}
	
	/**
	 * menu4 내 상태
	 */
	public void showMyStatus () {
		CustomerInfoVO info = new CustomerInfoVO();
		System.out.println("이름을 입력하세요.");
		String tempName = this.input.inputString();
		info = this.nameCheck(tempName);
		
		if ( info.getName() != null ) {
			System.out.println("이름: " + info.getName());
			System.out.println("대출 금액: " + info.getLoanAmount());
			System.out.println("담보: " + info.getGuarantee());
			System.out.println("소지금액: " + info.getOwnCash());
		}
		else {
			System.out.println("출력할 정보가 없습니다.");
		}
	}
	
}
