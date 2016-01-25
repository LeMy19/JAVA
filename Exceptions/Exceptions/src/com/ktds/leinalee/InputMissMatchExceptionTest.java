package com.ktds.leinalee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExceptionTest {
	
	public void start() {
		
		System.out.println("정수를 입력하세요.");
		
		Scanner input = new Scanner( System.in );
		int number = 0;

//		사용자가 정수를 입력할 때까지 반복한다. 
		while (true) {
//			예외가 발생할지 아닐지 모르겠지만, 우선 실행해본다. 
			try {
//				예외가 발생할 가능성이 있는 코드들... 
				number = input.nextInt();
				break;
			}
//			try 내부의 코드가 InputMisMatchException 을 던진다면 
//			예외를 받아온다. 
//			catch가 실행되는 동안은 program이 종료되지 않는다. 
			catch (InputMismatchException ime ) {
				input = new Scanner (System.in);
				System.out.println("잘 못 입력하셨습니다! 정수만 입력할 수 있어요.");	
				
//				쓰면 안되는 코드 
//				예외의 구체적인 정보를 알고 싶을 때 쓴다. 
//				구체적인 정보를 알고 난 뒤에는 반드시 지워야 한다. 
//				ime.printStackTrace();
				
//				애용해야하는 코드
//				어떤 예외가 발생했는지 간략히 알려준다. 
				System.out.println( 
						ime.getClass().getName() + "예외가" +
						ime.getMessage() + "때문에 발생했습니다.");
				
			}

		} //while 
		
		System.out.println("당신이 입력한 정수는 " + number + " 입니다.");
		
		int numberOne = 0;
		int numberTwo = 0;
		int numberThree = 0;
//		switch 문을 사용하기 위한 케이스 변수
		int currentStatus = 1;
		
		while(true) {
			try {
				switch( currentStatus ) {
				case 1 : 
					System.out.println("첫 번째 수 입력 : ");
					numberOne = input.nextInt();
//					case 1 이 잘 된다면, currentStatus를 2로 바꿔주고 다음부터 시작하도록한다
					currentStatus = 2;
				case 2 :
					System.out.println("두 번째 수 입력 : ");
					numberTwo = input.nextInt();
					currentStatus = 3;
				case 3 : 
					System.out.println("세 번째 수 입력 : ");
					numberThree = input.nextInt();
					currentStatus = 1;
				}
				break;
			} catch (InputMismatchException ime) {
				input = new Scanner (System.in);
				System.out.println("잘 못 입력하셨습니다.");
			}
			
		} //while
		
		System.out.println("당신이 입력한 수는 " + numberOne);
		System.out.println("당신이 입력한 수는 " + numberTwo);
		System.out.println("당신이 입력한 수는 " + numberThree);
		
	}
	
	
	public static void main(String[] args) {

		InputMissMatchExceptionTest test = new InputMissMatchExceptionTest();
		test.start();
		
	}

}
