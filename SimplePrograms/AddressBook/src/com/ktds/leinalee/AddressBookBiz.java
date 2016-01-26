package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class AddressBookBiz {

//	instance field
	private List<AddressBookInfoVO> addressInfoList;

//	Setter & Getter
	public List<AddressBookInfoVO> getAddressInfoList() {
		return addressInfoList;
	}
	
	public void setAddressInfoList(List<AddressBookInfoVO> addressInfoList) {
		this.addressInfoList = addressInfoList;
	}

//	생성자
	public AddressBookBiz () {
		this.addressInfoList = new ArrayList<AddressBookInfoVO>();
	}
	
	//	1. create
	public void addNewAddress(AddressBookInfoVO addressInfoList) {
		this.addressInfoList.add(addressInfoList);
	}
	
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
	
//	3. delete
	public void deleteAddressbyName(String name) {
//		이름으로 주소를 검색함 
		for (AddressBookInfoVO addressInfo : this.addressInfoList) {
			if (addressInfo.getName().equals(name)) {
				this.addressInfoList.remove(addressInfo);
			}
		}
	}
	
	//	5. showAll
	public void showAllAddress () {
		int numbering = 1 ;
		for (AddressBookInfoVO addressInfo : this.addressInfoList) {
			System.out.println(numbering + "번째 : " + addressInfo.getName());
			numbering++;
		}
		if( numbering == 1) {
			System.out.println("현재 주소록에 등록된 주소가 없습니다. ");
		} 
		else {
			System.out.println("총 " + (numbering-1) + "개의 주소가 검색되었습니다.");
		}
		System.out.println("-------------------------------");
	}
	
	
	
}
