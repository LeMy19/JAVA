package com.ktds.leinalee;

/**
 * 애완동물의 정보를 가지는 클래스 
 * @author kiyeon lee 
 */

public class Pet {
	
	/**
	 * 만들 수 있는 애완 동물의 수 
	 */
	public static int petCount = 2; 
	
/*	public static int test;*/
	
	/**
	 *  애완 동물의 종류
	 */
	//public String type; 
	private String type;
	//인스턴스 변수들은 public을 하면 안된다. 
	
	/**
	 * 애완 동물의 이름 
	 */
	//public String name; 
	private String name;
	
	//set & get 으로 받아오고 보내준다
	public void setType( String type ) {
		this.type = type;		
	}
	
	public void setName( String name ) {
		this.name = name;
		//name = name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
	

}
