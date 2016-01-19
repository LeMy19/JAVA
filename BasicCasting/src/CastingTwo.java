
public class CastingTwo {
	
	public static void main(String[] args){
		//sudo coding
		
		int numberOne = 15; 
		
		//숫자 15를 2로 나눈다. 
		int numberTwo = numberOne / 2;
		
		//결과를 출력한다. 
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberTwo + "입니다");
		
		/* 
		double numberThree = numberOne / 2;
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberThree + "입니다");
		>> int와 int가 나누면 결과는 int 
		>> 따라서 7.0이 결과 값으로 도출되는 것이다. 
		>> 하지만 double/2는 double이다. 
		*/
		
		//double numberThree = (double)numberOne / 2;
		double numberThree = numberOne / 2.0; //으로 간단하게 result를 double로 만들 수 있다.
		System.out.println(numberOne + " 나누기 2의 결과는 " + numberThree + "입니다");
		
		//숫자 15를 실수로 변환한다. 
		//4 byte(int) > 8 byte(double) 
		double numberFour = numberOne;
		
		//실수 15를 2로 나눈다. 
		double numberFive = numberFour / 2;
		
		//그리고 결과를 출력한다. 
		
		System.out.println(numberFour + " 나누기 2의 결과는 " + numberFive + " 입니다.");
	}

}
