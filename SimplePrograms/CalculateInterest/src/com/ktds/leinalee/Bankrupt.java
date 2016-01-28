package com.ktds.leinalee;

public class Bankrupt {

	/**
	 * menu3 파산
	 */
	public void preCheck (InputPackage input, BankBiz biz) {
		System.out.println("정말로 파산하시겠습니까? Y/N");
		if ( input.inputPreCheck() ) {
			this.bankrupt(input, biz);
		}
	}
	
	public void bankrupt (InputPackage input, BankBiz biz) {
		CustomerInfoVO info = new CustomerInfoVO();
		System.out.println("이름을 입력하세요.");
		String tempName = input.inputString();
		info = biz.nameCheck(tempName);
		
		if ( info.getName() != null ) {
			biz.getCustomerInfo().remove(info);
			System.out.println("파산하였습니다.");
		}
		else {
			System.out.println("이름이 정확하지 않습니다.");
		}
	}
	
}
