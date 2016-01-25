package com.ktds.leinalee;

public class NullPointerExceptionTest {

	public void start() {
		String str = null; //�ν��Ͻ��� ������ ���� �ȵ�
//		String str = new String("BBB"); //�ν��Ͻ��� ����� = �޸𸮸� ����Ѵ�. 
		
		for( int i = 0; i < 3; i++) {
			
			if(str !=null && str.equals("AAA")) {
				System.out.println("AAA�Դϴ�.");
			} 
			else {
				System.out.println("�����Դϴ�");
			}
			
		}
	}

	public static void main(String[] args) {
		
//		long longnNumber = 10L;
//		float floatNumber = 0.0f;
//		double doubleNumber = 0.0d;
		/*
		 * primitive Ÿ�Ե��� default value
		 * ====================
		 * byte 	= 0;
		 * int 		= 0;
		 * short 	= 0;
		 * long 	= 0L;
		 * float 	= 0.0f
		 * double 	= 0.0D || 0.0 (�Ǽ��� �⺻ Ÿ��)
		 * boolean 	= false
		 * char 	= ''
		 * ====================
		 */
		
		/*
		 * Reference Ÿ���� �⺻ �� 
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
