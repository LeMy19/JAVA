package com.ktds.leinalee;

import java.util.List;
import java.util.Scanner;

public class AddressBookMenuPress4 {
	
//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	private AddressBookInfoVO addressBookInfo;

	private Scanner scanner;
	
//	4. update 
	public void updateAddress(String name, String address) {
		
		AddressBookInfoVO addressInfoList = new AddressBookInfoVO();
		
		int tempAge = 0;
		String tempPhoneNumber = "";
		String tempAddress = "";
		
//		이름으로 검색해서 주소를 뺀 나머지를 받아온 다음 주소를 지움 
		for(AddressBookInfoVO addressInfo : this.addressInfoList) {
			if (addressInfo.getName().equals(name)) {
				tempAge = addressInfo.getAge();
				tempPhoneNumber = addressInfo.getPhoneNumber();
				this.addressInfoList.remove(addressInfo);
			}
			else {
				System.out.println("원하는 이름이 검색되지 않습니다.");
			}
		}
		
//		다시 새로 주소를 입력해준다. 
		addressInfoList.setName(name);
		addressInfoList.setAge(tempAge);
		addressInfoList.setPhoneNumber(tempPhoneNumber);
		addressInfoList.setAddress(address);
		
		this.addressInfoList.add(addressInfoList);	
	}
	
	
}
