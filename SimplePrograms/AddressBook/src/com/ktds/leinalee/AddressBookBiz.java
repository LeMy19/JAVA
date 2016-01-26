package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Biz : Business Address
 * Create : 
 * Read : 이름으로 찾는다.
 * Update : Update는 하지 않는다. 
 * Delete : 이름으로 삭제한다. 
 * ===============================
 * CRUD 
 * @author 206-025
 *
 */
public class AddressBookBiz {

//	instance field
	private List<AddressBookInfoVO> addressInfoList;
	
	private AddressBookMenuPrint menu;
	private AddressBookMenuPress1 menu1;
	private AddressBookMenuPress2 menu2;
	private AddressBookMenuPress3 menu3;
	private AddressBookMenuPress4 menu4;
	private AddressBookMenuPress5 menu5;
	
//	생성자
	public AddressBookBiz () {
		this.addressInfoList = new ArrayList<AddressBookInfoVO>();
	
		this.menu = new AddressBookMenuPrint();
		this.menu1 = new AddressBookMenuPress1();
		this.menu2 = new AddressBookMenuPress2();
		this.menu3 = new AddressBookMenuPress3();
		this.menu4 = new AddressBookMenuPress4();
		this.menu5 = new AddressBookMenuPress5();
	}

//	getter & setter
	public List<AddressBookInfoVO> getAddressInfoList() {
		return addressInfoList;
	}

	public void setAddressInfoList(List<AddressBookInfoVO> addressInfoList) {
		this.addressInfoList = addressInfoList;
	}
	
//	9. exit 종료 
	public void exitAddressProgram() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
