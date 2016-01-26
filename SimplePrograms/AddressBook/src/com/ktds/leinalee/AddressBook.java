package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

//		instance field
	private List<AddressBookInfoVO> addressInfoList;

	public void start() {
		
		String name = "";
		String address = "";
		
		AddressBookInfoVO addressBookInfo = null;
		AddressBookBiz biz = new AddressBookBiz();
		AddressBookMenuPrint menu = new AddressBookMenuPrint();

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			menu.mainMenu();
			menu.choiceMenu();

			if( menu.getFlag() == 1) {
				System.out.println("이름을 입력하시오.");
				addressBookInfo.setName(scanner.next());
				
				System.out.println("나이를 입력하시오.");
				try {
					addressBookInfo.setAge(scanner.nextInt());
				} catch (InputMismatchException ime) {
					System.out.println("잘 못 된 나이 입력입니다.");
					System.out.println("메뉴로 되돌아 갑니다.");
				}		
				
				System.out.println("주소를 입력하시오.");
				addressBookInfo.setAddress(scanner.next());
				
				System.out.println("전화번호를 입력하시오.");
				
				while(addressBookInfo.setPhoneNumber(scanner.next()));
				
				this.addNewAddress(addressBookInfo);
				
			}
			else if (menu.getFlag() == 2) {
				menu2.program();
			} 
			else if (menu.getFlag() == 3) {
				System.out.println("삭제하고 싶은 대상의 이름을 입력하세요.");
				menu3.deleteAddressbyName(scanner.next());
			} 
			else if (menu.getFlag() == 4) {
				System.out.println("수정하고 싶은 주소의 이름을 입력하세요.");
				name = scanner.next();
				
				System.out.println("수정하고 싶은 주소를 입력하세요.");
				address = scanner.next();
				
				biz.updateAddress(name, address);
			} 
			else if (menu.getFlag() == 5) {
				biz.showAllAddress();
			}
			else {
				biz.exitAddressProgram();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		AddressBook addrsssBook = new AddressBook();
		addrsssBook.start();
	}
}
