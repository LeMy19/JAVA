package com.ktds.leinalee;

/**
 * �ֿϵ����� ������ ������ Ŭ���� 
 * @author kiyeon lee 
 */

public class Pet {
	
	/**
	 * ���� �� �ִ� �ֿ� ������ �� 
	 */
	public static int petCount = 2; 
	
/*	public static int test;*/
	
	/**
	 *  �ֿ� ������ ����
	 */
	//public String type; 
	private String type;
	//�ν��Ͻ� �������� public�� �ϸ� �ȵȴ�. 
	
	/**
	 * �ֿ� ������ �̸� 
	 */
	//public String name; 
	private String name;
	
	//set & get ���� �޾ƿ��� �����ش�
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
