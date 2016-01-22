package com.ktds.leinalee;

import java.util.Scanner;

public class Market {
	
	/**
	 * 담배가게 메뉴
	 */
	public void showMenu () {
		System.out.println("\n------menu------");
		System.out.println("1....담배사기....");
		System.out.println("2...내상태확인...");
		System.out.println("3...가게재고확인...");
		System.out.println("4....담배피기....");
		System.out.println("5.....집으로.....");
		System.out.println("6....내상태변경....");
		System.out.println("----------------");
		System.out.print("원하는 메뉴를 선택하세요. \n선택:");
	}
	
	
	public void start () {
				
//		소비자 정보 
		int menu;
		int age;
		int inputMoneyForCigarette;
		int selectedCigarette;
		
//		조건문 체크할 때 필요한 변수 
		boolean checkAge = true;
		boolean checkMoney = true;
		boolean checkCigaretteCount = true;
		String goHome;
		
//		인스턴스 생성 
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		Store store = new Store();	
			
//		program start! 
		System.out.println("<<담배가게에 오신 것을 환영합니다>>");
//		초기 상태 설정
		customer.setInfo(scanner);

//		반복
		while (true) {
			showMenu();
			menu = scanner.nextInt();

//			나이확인 하기 
			checkAge = customer.underAgeCheck();
	
//			담배사기
			if ( menu == 1 && checkAge ) {
				System.out.println("현재 담배 가격:"+store.CIGARETTE_PRICE);
				System.out.print("돈을 넣으세요:");
				inputMoneyForCigarette = scanner.nextInt();
				
				System.out.print("담배를 몇개 살지 정하세요:");
				store.computeMoney(inputMoneyForCigarette);
				selectedCigarette = scanner.nextInt();				
				
//				재고확인 
				checkCigaretteCount = store.checkCigarette(selectedCigarette);
				
//				소비자 돈 확인
				checkMoney = customer.moneyCheck(inputMoneyForCigarette, selectedCigarette, customer, store);

				if ( !checkCigaretteCount || !checkMoney ) {
					System.out.print("집으로 가시겠습니까? y/n :");
					goHome = scanner.next();
					if(goHome.equalsIgnoreCase("y")) {
						break;
					} else 
						continue;
				}
				
//				담배 판매 최종 확정  
				store.getMoney(inputMoneyForCigarette, customer);
				store.giveChange(inputMoneyForCigarette, selectedCigarette, customer);
				store.giveCigarette(customer, selectedCigarette);
//			2. 내상태확인
			} else if ( menu == 2 ) { 
				customer.printInfo();
//			3. 가게 재고 확인	
			} else if ( menu == 3) { 
				store.printInfo();
//			4. 담배피기
			} else if ( menu == 4 ) { 
				customer.isSmoking();
//			5. 집으로 (종료)
			} else if ( menu == 5 ) { 
				System.out.println("담배가게를 벗어납니다... 안녕히가세요!");
				break;
//			6. 초기상태 변경 (나이, 이름)
			} else if ( menu == 6) { 
				customer.setInfo(scanner);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Market mart = new Market();
		mart.start();
		
	}

}
