package com.ktds.leinalee;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public void start() {
		
		List<String> list = new ArrayList<String	>();
		
		list.add("김광민");
		list.add("김현섭");
		list.add("이기연");
		list.add("김하늘");
		list.add("양지한");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println(list.size());
		
//		case#1 : 데이터가 몇번째 인덱스에 있는지 찾을 때
		for (int i = 0; i < list.size(); i++) {
			
			if( list.get(i).equals("이기연")) {
				System.out.println("이기연을 찾았습니다.");
			}
		} //for
		
//		case#2
		if(list.contains("남준호")) {
			System.out.println(list.indexOf("남준호"));
		}
		if(list.contains("이기연")) {
			System.out.println(list.indexOf("이기연"));
		}
		
//		case#3 : 단순 있는지 없는지 찾을 때
		if ( list.contains("이기연")) {
			System.out.println("이기연을 찾았습니다.");
		} 
		
//		get을 이용한 이기연 출력하기
		String name = list.get( list.indexOf("이기연"));
		System.out.println(name);
		
//		set : 정보를 swap해주는 것. 그러나 이것보다 더 좋은 기능이 있다.
		System.out.println(list.size());
		list.set(2, "조민제");
		System.out.println(list.get(2));
		System.out.println(list.size());
		
//		remove 
		list.remove(2);
		list.remove("김현섭");
		
		list.get( list.indexOf("김현섭"));
		list.get( list.indexOf("조민제"));
		
	}
	
	public static void main(String[] args) {
		
		ListTest test = new ListTest();
		test.start();
	}
}
