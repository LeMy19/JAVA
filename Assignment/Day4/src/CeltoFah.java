import java.util.Scanner;

public class CeltoFah {
	public static void main(String[] args) { // main 부분의 중괄호가 끝나는 순간 프로그램이 끝난다.

		/*
		 * 섭씨 > 화씨 : F = C * 1.8 - 32 화씨 > 섭씨 : C = ( F - 32 ) / 1.8
		 */

		/**
		 * 
		 */

		// 여기서 선언된 변수는 모두 사용할 수 있지만, 중괄호 안에서 사용된 변수는 밖에서 못 사용한다.
		int typeChoice = 0;
		Scanner userInput = new Scanner(System.in);

		// 무한반복
		while (true) {

			System.out.println("<<온도를 변환하는 프로그램입니다>>");
			System.out.println("1. 섭씨를 화씨로 변경");
			System.out.println("2. 화씨를 섭씨로 변경");
			System.out.println("3. 종료");

			typeChoice = userInput.nextInt(); // 정수를 받아오겠다.

			if (typeChoice == 1) {
				System.out.println("섭씨를 화씨로 변경합니다.");
				System.out.print("섭씨를 입력해주세요:");
				int cel = userInput.nextInt();
				double fah = (cel * 1.8) + 32;
				System.out.println("섭씨 " + cel + "도는 화씨 " + fah + "도 입니다.");

			} else if (typeChoice == 2) {
				System.out.println("화씨를 섭씨로 변경합니다.");
				System.out.print("화씨를 입력해주세요:");
				// 여기서 fah와 cel을 위에와 똑같이 변수 선언할 수 있는 이유는
				// 중괄호에서 선언되었기 때문에 이 부분이 끝나면 변수가 없어진다.
				int fah = userInput.nextInt();
				double cel = (fah - 32) / 1.8;
				System.out.println("화씨 " + fah + "도는 섭씨 " + cel + "도 입니다.");

			} else if (typeChoice == 3) {
				break;
								
			} else {
				System.out.println("잘 못 입력하셨습니다.");

			}

			
		}
		
		System.out.println("프로그램을 종료합니다.");

	}

}
