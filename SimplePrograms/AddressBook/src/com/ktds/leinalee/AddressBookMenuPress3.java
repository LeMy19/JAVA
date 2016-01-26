package com.ktds.leinalee;

import java.util.List;
import java.util.Scanner;

public class AddressBookMenuPress3 {
//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	private AddressBookInfoVO addressBookInfo;

	private Scanner scanner;
	
	
//	3. delete
	public void deleteAddressbyName(String name) {
//		이름으로 주소를 검색함 
		for (AddressBookInfoVO addressInfo : this.addressInfoList) {
			if (addressInfo.getName().equals(name)) {
				this.addressInfoList.remove(addressInfo);
			}
		}
	}
	
	public void program () {
		System.out.println("삭제하고 싶은 대상의 이름을 입력하세요.");
		this.deleteAddressbyName(scanner.next());
	}
}
