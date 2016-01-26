package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	

	public void start() {
		
		AddressBookInfoVO addressBookInfo = null;
		AddressBookBiz biz = new AddressBookBiz();
		AddressMenu menu = new AddressMenu();
		
		Scanner scanner = new Scanner (System.in);
		
		String name = "";
		
		while(true) {

			addressBookInfo = new AddressBookInfoVO();
			menu.mainMenu();
			menu.choiceMenu();
			
			if(menu.getFlag() == 1) {
				System.out.println("이름을 입력하시오.");
				addressBookInfo.setName(scanner.nextLine());
				scanner = new Scanner(System.in);
				
				System.out.println("나이를 입력하시오.");
				try {
					addressBookInfo.setAge(scanner.nextInt());
				} catch (InputMismatchException ime) {
					System.out.println("잘 못 된 나이 입력입니다.");
					System.out.println("메뉴로 되돌아 갑니다.");
				}
				
				scanner = new Scanner(System.in);
				System.out.println("전화번호를 입력하시오.");
				while(addressBookInfo.setPhoneNumber(scanner.nextLine()));
				
				scanner = new Scanner(System.in);
				System.out.println("주소를 입력하시오.");
				addressBookInfo.setAddress(scanner.nextLine());
				
				
				biz.addNewAddress(addressBookInfo);
				
			} 
			else if (menu.getFlag() == 2){
				System.out.println("찾고 싶은 대상의 이름을 입력하세요.");
				name = scanner.next();
				addressBookInfo = biz.findAddressByName(name);
				
				try {
					if( addressBookInfo.getName().equals(name)) {
						System.out.println("이름 : " +addressBookInfo.getName());
						System.out.println("나이 : " +addressBookInfo.getAge());
						System.out.println("전화 번호: " +addressBookInfo.getPhoneNumber());
						System.out.println("주소 :" +addressBookInfo.getAddress());
					} 
				} 
				catch(NullPointerException npe) {
					System.out.println(npe.getMessage() + "라는 오류가 발생했습니다.");
					System.out.println("찾는 주소가 없습니다.");
				}
			}
			else if ( menu.getFlag() == 3) {
				System.out.println("삭제하고 싶은 대상의 이름을 입력하세요.");
				biz.deleteAddressbyName(scanner.next());
			}
			else if (menu.getFlag() == 5) {
				System.out.println("등록된 주로록을 불러옵니다....loading....");
				biz.showAllAddress();
			}
			else {
				scanner = new Scanner(System.in);
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		AddressBook phoneBook = new AddressBook();
		phoneBook.start();
		
	}
}
