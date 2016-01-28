package com.ktds.leinalee;

public class PaybackCash {

	private Bankrupt menu3;
	
	public PaybackCash () {
		menu3 = new Bankrupt();
	}

	/**
	 * menu2 상환
	 */
	public void payBackMenu () {
		System.out.println("<상환>");
		System.out.println("대출인 이름을 입력하세요.");
	}
	
	public void payBack (InputPackage input, BankBiz biz, CheckTime checkTime) {
		String tempName = input.inputString();
		CustomerInfoVO tempInfo = biz.nameCheck(tempName);
		
//		대출한 이름인지 확인
		if ( tempInfo.getName() != null) {
//			대출가능한 돈을 소유하는지 체크
			if ( this.canPayBack(tempInfo, checkTime) ) {
				System.out.println("돈을 상환합니다.");
				tempInfo.setLoanAmount(0);
				long ownCash = tempInfo.getOwnCash();
				tempInfo.setOwnCash(ownCash - tempInfo.getPayBackMoney());
			}
			else {
				System.out.println("현재 돈으로 갚을 수 없습니다.");
				menu3.preCheck(input, biz);
			}
		}
		else {
			System.out.println("없는 이름입니다.");
		}
		
	}
	
	
//	계산할 수 있는지 체크하기
	public boolean canPayBack(CustomerInfoVO tempInfo, CheckTime checkTime) {
		checkTime.timeCheck();
		int currentTime = checkTime.timeCheck();
		int totalRentTime = checkTime.totalRentalTime(tempInfo.getLoanDate(), currentTime);
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
		int time = Math.round(nTime/5);
		double rate = Math.pow(BankBiz.RATE, time);
		int total =  (int) Math.round(tempInfo.getLoanAmount() * rate);
		tempInfo.setPayBackMoney(total);
		System.out.println("당신이 갚아야할 돈은 " + tempInfo.getPayBackMoney() + "원 입니다.");
		return total;
	}
	
}
