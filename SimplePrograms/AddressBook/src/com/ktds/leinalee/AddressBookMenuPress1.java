package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBookMenuPress1 {

//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	private AddressBookInfoVO addressBookInfo;

	private Scanner scanner;
	
//	Setter & Getter
	public List<AddressBookInfoVO> getAddressInfoList() {
		return addressInfoList;
	}

	public void setAddressInfoList(List<AddressBookInfoVO> addressInfoList) {
		this.addressInfoList = addressInfoList;
	}
	
	public AddressBookInfoVO getAddressBookInfo() {
		return addressBookInfo;
	}
	
	public void setAddressBookInfo(AddressBookInfoVO addressBookInfo) {
		this.addressBookInfo = addressBookInfo;
	}

//	생성자
	public AddressBookMenuPress1 () {
		this.addressInfoList = new ArrayList<AddressBookInfoVO>();
		addressBookInfo = new AddressBookInfoVO();
		scanner = new Scanner(System.in);
	}
	
	
	//	1. create
	public void addNewAddress(AddressBookInfoVO addressInfoList) {
		this.addressInfoList.add(addressInfoList);
	}
	
	private void inputName() {
		System.out.println("이름을 입력하시오.");
		addressBookInfo.setName(scanner.next());
	}
	
	private void inputAge() {
		System.out.println("나이를 입력하시오.");
		try {
			addressBookInfo.setAge(scanner.nextInt());
		} catch (InputMismatchException ime) {
			System.out.println("잘 못 된 나이 입력입니다.");
			System.out.println("메뉴로 되돌아 갑니다.");
		}		
	}
	
	public void inputAddress() {
		System.out.println("주소를 입력하시오.");
		addressBookInfo.setAddress(scanner.next());
	}
	
	public void inputPhoneNumber()  {
		System.out.println("전화번호를 입력하시오.");
		
		while(addressBookInfo.setPhoneNumber(scanner.next()));
	}
	
	public void program () {
		
		this.inputName();
		this.inputAge();
		this.inputAddress();
		this.inputAddress();
		
		this.addNewAddress(addressBookInfo);
	}
	
}
