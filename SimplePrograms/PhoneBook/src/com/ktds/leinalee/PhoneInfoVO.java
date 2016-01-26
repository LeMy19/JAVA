package com.ktds.leinalee;


/**
 * VO : Value Object
 * 기능없이 인스턴스 필드와 Getter/Setter만 가지고 있다. 
 * @author 206-025
 *
 */
public class PhoneInfoVO {
	
//	Instance field
	private String name; 
	
	private String phoneNumber; 
	
	private int age;

//	Getter & Setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
