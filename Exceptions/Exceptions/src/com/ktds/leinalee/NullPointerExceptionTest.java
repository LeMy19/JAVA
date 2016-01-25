package com.ktds.leinalee;

public class NullPointerExceptionTest {

	public void start() {
		String str = null; //인스턴스가 생성이 아직 안됨
//		String str = new String("BBB"); //인스턴스를 만든다 = 메모리를 사용한다. 
		
		for( int i = 0; i < 3; i++) {
			
			if(str !=null && str.equals("AAA")) {
				System.out.println("AAA입니다.");
			} 
			else {
				System.out.println("에러입니다");
			}
			
		}
	}

	public static void main(String[] args) {
		
//		long longnNumber = 10L;
//		float floatNumber = 0.0f;
//		double doubleNumber = 0.0d;
		/*
		 * primitive 타입들의 default value
		 * ====================
		 * byte 	= 0;
		 * int 		= 0;
		 * short 	= 0;
		 * long 	= 0L;
		 * float 	= 0.0f
		 * double 	= 0.0D || 0.0 (실수의 기본 타입)
		 * boolean 	= false
		 * char 	= ''
		 * ====================
		 */
		
		/*
		 * Reference 타입의 기본 값 
		 * ====================================
		 * String 						= null;
		 * Scanner						= null;
		 * System						= null;
		 * NullPointerExceptionTest		= null;
		 * NumberFormatException		= null;
		 * InputMisMatchException		= null;
		 * ====================================
		 */
		
		NullPointerExceptionTest test = new NullPointerExceptionTest();
		test.start();
	}
}
