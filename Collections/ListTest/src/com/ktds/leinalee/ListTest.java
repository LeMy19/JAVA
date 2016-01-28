package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public void start() {
		
		List<String> list = new ArrayList<String	>();
		
		list.add("�豤��");
		list.add("������");
		list.add("�̱⿬");
		list.add("���ϴ�");
		list.add("������");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println(list.size());
		
//		case#1 : �����Ͱ� ���° �ε����� �ִ��� ã�� ��
		for (int i = 0; i < list.size(); i++) {
			
			if( list.get(i).equals("�̱⿬")) {
				System.out.println("�̱⿬�� ã�ҽ��ϴ�.");
			}
		} //for
		
//		case#2
		if(list.contains("����ȣ")) {
			System.out.println(list.indexOf("����ȣ"));
		}
		if(list.contains("�̱⿬")) {
			System.out.println(list.indexOf("�̱⿬"));
		}
		
//		case#3 : �ܼ� �ִ��� ������ ã�� ��
		if ( list.contains("�̱⿬")) {
			System.out.println("�̱⿬�� ã�ҽ��ϴ�.");
		} 
		
//		get�� �̿��� �̱⿬ ����ϱ�
		String name = list.get( list.indexOf("�̱⿬"));
		System.out.println(name);
		
//		set : ������ swap���ִ� ��. �׷��� �̰ͺ��� �� ���� ����� �ִ�.
		System.out.println(list.size());
		list.set(2, "������");
		System.out.println(list.get(2));
		System.out.println(list.size());
		
//		remove 
		list.remove(2);
		list.remove("������");
		
		list.get( list.indexOf("������"));
		list.get( list.indexOf("������"));
		
	}
	
	public static void main(String[] args) {
		
		ListTest test = new ListTest();
		test.start();
	}
}
