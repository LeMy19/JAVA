package com.ktds.leinalee;

/**
 * VO : Value Object
 * 기능없이 인스턴스 필드와 Getter/Setter만 가지고 있다. 
 * @author 206-025
 *
 */
public class AddressBookInfoVO {
	
//	instance field
	private String name; 
	private int age;
	private String phoneNumber;
	private String address;
	
//	getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public boolean setPhoneNumber(String phoneNumber) {
		if( !phoneNumber.matches("^[0-9-]*$") ){
			System.out.println("잘 못된 전화번호 형식입니다. 다시 입력하세요.");
			return true;
		}
		this.phoneNumber = phoneNumber;
		return false;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
