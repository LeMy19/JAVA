import java.util.Scanner;

public class ScannerTwo {
	public static void main(String[] args){
		
		//int형 변수 두개를 정의한다 
		int numberOne;
		int numberTwo;
		
		//int형 변수 각각에 Scanner를 통해 값을 입력받는다
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 더하는 프로그램입니다."); //println: printline 
		System.out.print("첫번쩨 숫자를 입력하세요. "); //print는 다음줄로 내려가지 않는다.
		numberOne = scanner.nextInt();
		System.out.print("두번쩨 숫자를 입력하세요. ");
		numberTwo = scanner.nextInt();
		
		//int형 변수 두 개를 더한 다른 변수에 저장한다
		int additionalResult = numberOne + numberTwo;
		
		//두 개를 더한 결과를 출력한다.
		System.out.println(
				numberOne + "+" +
				numberTwo + "=" +
				additionalResult);
	}

}
