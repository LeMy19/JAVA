package com.ktds.leinalee;

import java.util.List;
import java.util.Scanner;

public class AddressBookMenuPress5 {

//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	private AddressBookInfoVO addressBookInfo;

	private Scanner scanner;
	
	
	public void showAllAddress () {
		int numbering = 1 ;
		for (AddressBookInfoVO addressInfo : this.addressInfoList) {
			System.out.println(numbering + "번째 : " + addressInfo.getName());
			numbering++;
		}
		System.out.println("-------------------------------");
	}
	
	
	public void program() {
		
	}
}
