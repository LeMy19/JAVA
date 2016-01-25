import java.util.Scanner;

/**
 * 
[2016-01-13]
1. 체질량 지수 계산하기 : 몸무게 / (키 * 키)
2. 화씨온도를 섭시온도로 변환해서 출력하기 
(화씨온도 - 32 ) / 1.8 
3. 섭씨 온도를 화씨온도로 변환해서 출력하기 
(1.8 * 섭씨 온도) + 32
 * @author 206-025
 *
 */
public class AS1 {
	public static void main(String[] args){
		
		double weight; //사용자가 입력한 숫자를 저장할 변수 
		double height;
		double result; 
		
		//1. 체질량 지수 계산하기 : 몸무게 / (키 * 키) 
		System.out.println("1. 체질량 지수 계산하기");
		System.out.println("체질량 지수를 계산하기 위해서 몸무게를 입력해주세요(kg은 생략) : ");
		Scanner console1 = new Scanner( System.in );
		weight = console1.nextInt(); //사용자로부터 int 데이터를 입력받는다. 
		
		System.out.println("감사합니다.");
		System.out.println("체질량 지수를 계산하기 위해서 키를 입력해주세요(cm는 생략) : ");
		Scanner console2 = new Scanner(System.in);
		height = console2.nextInt();
		
		result = (weight / (height * height)) * 100;
		System.out.println("당신의 체량량 지수는 :" + result + "% 입니다");
		
	}

}
