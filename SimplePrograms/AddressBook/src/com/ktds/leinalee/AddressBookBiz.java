package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
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
/*		int index = 0;
		try {
			for (AddressBookInfoVO addressInfo : this.addressInfoList) {
				if ( addressInfo.getName() != null && addressInfo.getName().equals(name)) {
					index = this.addressInfoList.indexOf(name);
					this.addressInfoList.remove(index);
					this.addressInfoList.remove(addressInfo);
				}
			}
		}
		catch (ConcurrentModificationException | ArrayIndexOutOfBoundsException error) {
			System.out.println(error.getMessage() +"오류가 났습니다.");
		}
		*/
//		리스트 탐색은 역방향으로 해야한다. 
		for ( int i = addressInfoList.size() - 1; i >= 0; i--) {
			if ( addressInfoList.get(i).getName().equals(name) ) {
				addressInfoList.remove(i);
			}
		}

	}
	
//	4. modify
	public void modifyAddressbyName(String name) {
//		이름으로 주소를 검색함 
//		int index = 0;
		try {
			for (AddressBookInfoVO addressInfo : this.addressInfoList) {
				if ( addressInfo.getName() != null && addressInfo.getName().equals(name)) {
//					index = this.addressInfoList.indexOf(name);
//					this.addressInfoList.remove(index);
					this.addressInfoList.remove(addressInfo);
					
//					인스턴스는 메모리 주소를 가지고 있음 
//					addressInfo.setName(scanner.next());
					
					
				}
			}
		}
		catch (ConcurrentModificationException | ArrayIndexOutOfBoundsException error) {
			System.out.println(error.getMessage() +"오류가 났습니다.");
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
