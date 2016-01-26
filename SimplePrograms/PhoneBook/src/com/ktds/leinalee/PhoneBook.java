package com.ktds.leinalee;

import java.util.Scanner;

public class PhoneBook {
	
	public void start() {
		Scanner input = new Scanner (System.in);
		
		int choice = 0;
		String searchName = "";
		
		PhoneInfoVO phoneInfo = null;
		PhoneBookBiz biz = new PhoneBookBiz();
		
		while(true) {
			System.out.println("1. 등록 2. 찾기 해당하는 번호를 누르시오.");
			
			choice = input.nextInt();
			
			if(choice == 1) {
				System.out.println("이름, 전화번호, 나이를 순서대로 입력하시오.");
				phoneInfo = new PhoneInfoVO();
				phoneInfo.setName(input.next());
				phoneInfo.setPhoneNumber( input.next() );
				phoneInfo.setAge(input.nextInt());
				
				biz.addNewPhoneBookInfo(phoneInfo);
			} 
			else if (choice == 2){
				System.out.println("검색할 이름을 입력하시오.");
				searchName = input.next();
				
				phoneInfo = biz.getPhoneInforByName(searchName);
				System.out.println(phoneInfo.getName());
				System.out.println(phoneInfo.getPhoneNumber());
				System.out.println(phoneInfo.getAge());
				
			}
			else {
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.start();
		
	}
}
