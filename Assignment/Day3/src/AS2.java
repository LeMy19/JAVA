import java.util.Scanner;

/**
 * 2. 화씨온도를 섭씨온도로 변환해서 출력하기 
 * (화씨온도 - 32 ) / 1.8 
 * @author 206-025
 *
 */
public class AS2 {
	public static void main(String[] args){
		
		double fad; //화씨온도
		double cel; //섭씨온도
		
		System.out.println("2. 화씨온도를 섭씨온도로 변환해서 출력하기");
		System.out.println("변환할 화씨온도를 입력해주세요");
		
		Scanner console = new Scanner(System.in);
		fad = console.nextInt();
		cel = ((fad - 32) / 1.8) ;
		
		System.out.println("변환된 섭씨온도는 : " + cel + "입니다.");
	}

}
