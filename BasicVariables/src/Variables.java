
public class Variables {
	public static void main(String[] args){
		
		//변수의 정의 방법
		//변수형 변수명 = 값; 
		//정수형 변수를 정의한다.
		int numberOne = 10; 
		int numberTwo = 20;
		
		int additionResult; //아무 값도 할당하지 않을 수 있다
		//additionResult = 10 + 20;
		additionResult = numberOne + numberTwo;
		
		System.out.println(numberOne+"+"+numberTwo+"="+additionResult);
		
		//사칙연산 : + - * / % = 
		
		//numberOne을 12로 바꾸고 싶을 경우 
		//numberOne = numberOne + 2;
		//System.out.println(numberOne); //이것을 짧게 만들어 주는 것이 "사칙 단항 연산자"
		
		//사칙 단항 연산자 : += -+ *= ++ -- 
		System.out.println(numberOne+=2); //이러한 사칙연산은 = 앞에 것을 바꾸기만 하면 된다
		
	}

}
