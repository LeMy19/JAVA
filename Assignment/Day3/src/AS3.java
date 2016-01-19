import java.util.Scanner;

/**
 * 3. 섭씨 온도를 화씨온도로 변환해서 출력하기
 * (1.8 * 섭씨 온도) + 32
 * @author 206-025
 *
 */
public class AS3 {
	public static void main(String[] args){
		
		double fad;
		double cel;
		
		System.out.println("3. 섭씨온도를 화씨온도로 변환해서 출력하기");
		System.out.println("변환할 섭씨온도를 입력해주세요");
		
		Scanner console = new Scanner(System.in);
		cel = console.nextInt();
		fad = (1.8 * cel) + 32;
		
		System.out.println("변환된 화씨온도는 " + fad + " 입니다.");
	}

}
