import java.util.Scanner;

public class ScannerOne {
	public static void main(String[] args) {
		
		//변수 선언과 동시에 값의 초기화를 함
		int numberOne = 15;
		System.out.println(numberOne);
		
		//변수를 선언함 
		int numberTwo; 
		
		//선언된 변수에 값을 초기화 한다. 
		numberTwo = 35; 
		System.out.println(numberTwo);
		
		//변수를 선언함 
		int numberThree;
		//System.out.println(numberThree); //원래 result는 기본값 0으로 dedault되어 있다.
		
		//Scanner를 이용해 변수의 값을 초기화 함 
		Scanner input = new Scanner(System.in); //이제부터 데이터 입력을 받을 수 있다. input은 변수형이라 아무 naming 가능하다  
		numberThree = input.nextInt(); //정수를 변수에 넣을 수 있게 하는 것
		System.out.println(numberThree + "를 입력하셨습니다.");
		
		//next + (기본형) 으로 다 가능 
		boolean isBoolean = input.nextBoolean();
		System.out.println(isBoolean);
	}


}
