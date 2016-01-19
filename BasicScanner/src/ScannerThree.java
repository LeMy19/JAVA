import java.util.Scanner;

//첫번째, 두번째 숫자를 받아와 크기를 비교하는 프로그램
public class ScannerThree {
	
	public static void main(String[] args){
		
		//int형 변수 두 개를 선언한다. 
		int numberOne;
		int numberTwo;
		//int numberOne, numberTwo; 이렇게 할 수 있지만 소스의 가독성이 현저히 떨어진다. 
		
		//int형 변수 두 개에 Scanner을 이용해서 값을 저장한다. 
		Scanner console = new Scanner (System.in);
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰 지 알아보는 프로그램입니다.");
		System.out.print("첫 번째 숫자를 입력하세요.");
		numberOne = console.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요.");
		numberTwo = console.nextInt();
		
		//첫 번째 입력한 숫자가 두 번째 입력한 숫자보다 큰 지 알아본다. 
		boolean compareResult = numberOne > numberTwo;
				
		//그 결과를 출력한다.
		System.out.println(
					numberOne + "은 " +
					numberTwo + "보다 큰가요? " +
					compareResult); //문자열과 더해졌기 떄문이 바로 문자열(treu/false)로 출력된다.
	}

}
