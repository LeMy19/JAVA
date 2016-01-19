/*
 * for문이 동작하는 방식 
 * web사이트를 만들 때, for문을 사용하면서 게시판의 목록을 불러온다. 
 * for문이 어려운 이유는 for문의 중첩 활용이 어렵기 때문이다.
 * <for문의 중첩 활용>
 * 배열과 같은 것이 나올 때 for문을 중첩해서 사용한다. 
 * 2번 중첩하면 2D, 3번 중첩하면 3D 즉, 행렬..?
 * for 문에서의 조건식 변수는 대부분 i를 사용한다. 
 * (증감식)의 조건은 따로 없나..? 여기에 연산자를 다 넣을 수 있는 것인가?
 * 
 * while은 99.9%정도로 무한반복을 돌릴 때 사용한다. 
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		for(i = 0 ; i < 10 ; i++ ) {
			System.out.println(i);
		}

		System.out.println();
		
		for(i = 0 ; i < 10 ; ) {
			i++;
			System.out.println(i);
		}
		
		System.out.println();
		
		for(i = 0 ; i < 10 ; ) {
			++i;
			System.out.println(i);
		}
		
		//단일 구구단 외우기
		System.out.println("(단일구구단)8단을 외자!");
		for(int n=1; n<10; n++) {
			System.out.println("8 X " + n + " = " + (8*n));
		}
		
		
		//구구단 출력하기 중첩 for문을 적어넣어야한다. 
		for (int n = 1; n<10; n++) {
			System.out.println(n+"단 구구단을 외자!");
			for(int m = 1; m<10; m++){
				System.out.println(n+" X " + m +" = " + (n*m));
			}
		}
		
		
		//하나의 for문을 이용하여 **********(10개)를 입력하세요.
		for(int n=0; n<10; n++) {
			System.out.print("*");
		}
		System.out.println();
		
		//중첩 for문을 이용하여 
		// *
		// **
		// ***
		// ****
		// *****
		// 을 출력하시오 
		
		for(int n=1; n<6; n++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
