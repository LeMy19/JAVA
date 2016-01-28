package com.ktds.leinalee;

public class ShowStatus {

	/**
	 * menu4 내 상태
	 */
	public void showMyStatus (InputPackage input, BankBiz biz) {
		CustomerInfoVO info = new CustomerInfoVO();
		System.out.println("이름을 입력하세요.");
		String tempName = input.inputString();
		info = biz.nameCheck(tempName);
		
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
