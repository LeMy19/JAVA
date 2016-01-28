package com.ktds.leinalee;

public class LoanCash {

	/**
	 * menu1. 대출
	 */
	public void loanCashMenu () {
		System.out.println("<대출>");
		System.out.println("아래 사항을 차례로 입력하시오.");
		System.out.println("1. 이름 2. 전화번호 3. 대출금액 4. 담보 5. 소지금액");
	}
	
	public void loanCash (InputPackage input, CheckTime checkTime, BankBiz biz) {
		CustomerInfoVO tempInfo = new CustomerInfoVO();
		
		tempInfo.setName(input.inputString());
		tempInfo.setPhoneNumber(input.inputString());
		tempInfo.setLoanAmount(input.inputInt());
//		대출가능한지 체크 (한도초과)
		if ( canLoanCash (tempInfo.getLoanAmount()) && biz.getBankAmount() > tempInfo.getLoanAmount() ) {
			tempInfo.setGuarantee(input.inputString());
			tempInfo.setOwnCash(input.inputLong());
			tempInfo.setLoanDate(checkTime.timeCheck());
			
			biz.getCustomerInfo().add(tempInfo);
			System.out.print("담보 " + tempInfo.getGuarantee() + "로 ");
			System.out.println(tempInfo.getLoanAmount() + "원 대출 완료");
//			소지금액 갱신
			long ownCash = tempInfo.getOwnCash();
			tempInfo.setOwnCash(ownCash + tempInfo.getLoanAmount());
			System.out.println("---------------------------------------");
			int bankAmount = (int) (biz.getBankAmount() - tempInfo.getLoanAmount());
			biz.setBankAmount(bankAmount);
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
}
