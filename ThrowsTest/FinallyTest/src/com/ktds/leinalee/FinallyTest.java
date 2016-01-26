package com.ktds.leinalee;

public class FinallyTest {
	
	public void start() {
		
		int number;
		
		try {
			number  = Integer.parseInt("123");
			
			String str = null;
			str.length();
			
			System.out.println(number);
		}
		catch (NumberFormatException | NullPointerException nfe ) {
			System.out.println("숫자 변환에 실패했습니다." + nfe.getMessage());
			
			if( nfe instanceof NumberFormatException ) {
				System.out.println("숫자변환을 할 수 없습니다.");
			} 
			else if ( nfe instanceof NullPointerException ) {
				System.out.println("잘 못 된 참조입니다.");
			}
		}
/*		catch (NullPointerException npe) {
			System.out.println("잘못된 참조입니다. 객체가 null이 아닌지 확인하세요.");
		}*/
		finally {
			System.out.println("숫자 변환을 종료합니다.");
		}
	}
	
	public static void main(String[] args) {

//		this.start();
//		이렇게 되어야하는데, 안되는 이유는 static때문이다. 
//		호출하는 방법 1. 
//		static이 붙여있는 곳에서 호출하기 위해서는 똑같이 static이 붙여져야한다. this로는 접근 불가
//		static은 메모리가 따로 독립되어 있다.
		
//		호출하는 방법 2.
		FinallyTest test = new FinallyTest();
		test.start();
		
	}
}
