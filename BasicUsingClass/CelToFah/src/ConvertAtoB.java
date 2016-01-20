import java.util.Scanner;

public class ConvertAtoB {
	
	//scanner을 입력받을 수도있다.
	public void converAndPrintCeltoFah ( Scanner userInput) {
		
		System.out.println("섭씨를 화씨로 변경합니다.");
		System.out.print("섭씨를 입력해주세요:");
		int cel = userInput.nextInt();
		double fah = (cel * 1.8) + 32;
		System.out.println("섭씨 " + cel + "도는 화씨 " + fah + "도 입니다.");
	}
	
	public void converAndPrintFahtoCel ( Scanner userInput ) {
		
		System.out.println("화씨를 섭씨로 변경합니다.");
		System.out.print("화씨를 입력해주세요:");
		// 여기서 fah와 cel을 위에와 똑같이 변수 선언할 수 있는 이유는
		// 중괄호에서 선언되었기 때문에 이 부분이 끝나면 변수가 없어진다.
		int fah = userInput.nextInt();
		double cel = (fah - 32) / 1.8;
		System.out.println("화씨 " + fah + "도는 섭씨 " + cel + "도 입니다.");
	}

}
