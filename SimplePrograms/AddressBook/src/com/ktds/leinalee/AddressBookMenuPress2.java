package com.ktds.leinalee;

import java.util.List;
import java.util.Scanner;

public class AddressBookMenuPress2 {

//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	private AddressBookInfoVO addressBookInfo;

	private Scanner scanner;
	
//	2. read
	public AddressBookInfoVO findAddressByName(String name) {
//		이름으로 주소를 검색함
		for (AddressBookInfoVO addressInfo : this.addressInfoList) {
			if (addressInfo.getName().equals(name)) {
				return addressInfo;
			}
		}
		
		return new AddressBookInfoVO();
	}
	
	public void inputName() {
		System.out.println("찾고 싶은 대상의 이름을 입력하세요.");
		addressBookInfo = this.findAddressByName(scanner.next());		
	}
	
	public void printAddress() {
		System.out.println("이름 : " +addressBookInfo.getName());
		System.out.println("나이 : " +addressBookInfo.getAge());
		System.out.println("전화 번호: " +addressBookInfo.getPhoneNumber());
		System.out.println("주소 :" +addressBookInfo.getAddress());
	}
	
	public void program () {
		
		this.inputName();
		this.printAddress();
	}
	
}
