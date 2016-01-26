package com.ktds.leinalee;

public class ThrowsTest {

	public void start() {
		MakeExceptions makeExceptions = new MakeExceptions();
		
//		parseInt#1==================================================
		System.out.println("parseInt1 start");
		int number = 0;
		number = makeExceptions.parseInt("1234");
		
		
//		parseInt#2==================================================
		System.out.println("parseInt2 start");
		
		try {
//			할당하는 곳에서 error가 났으니 1234가 그대로 들어가는 것이다.
			number = makeExceptions.parseInt2("123");
		}
		catch(NumberFormatException nfe) {
			System.out.println("반환 불가\n");
			number = 0;
		}
		
		System.out.println(number);		
		
//		number = makeExceptions.parseInt3("DEF");

		
		try {
//			할당하는 곳에서 error가 났으니 1234가 그대로 들어가는 것이다.
			number = makeExceptions.parseInt3("DEF");
		}
		catch(NumberFormatException nfe) {
			System.out.println("반환 불가!!!");
			number = 0;
		}
		
		System.out.println(number);
		
		
		
	}

	public static void main(String[] args) {
		
		ThrowsTest test = new ThrowsTest();
		test.start();
	}
}
