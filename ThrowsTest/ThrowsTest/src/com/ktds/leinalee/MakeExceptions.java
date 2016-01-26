package com.ktds.leinalee;

public class MakeExceptions {

	/**
	 * 문자를 숫자로 변환한다. 
	 * 만약, 예쇠상황이 발생하면 적절한 조치를 취해준다.
	 * @param str
	 * @return
	 */
	public int parseInt(String str) {
		
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException nfe) {
			return 0 ;
		}
	}
	
	/**
	 * 문자를 숫자로 변환한다. 
	 * 만일 예외상황이 발생하면 적절한 조치를 취하지 않는다. 
	 * (try-catch하지 않는 method, 처리의 책임을 전가한다)
	 * @param str
	 * @return
	 */
	public int parseInt2(String str) {
		return Integer.parseInt(str);
	}
	
//	Exception : InvalidNumberException2
	public int parseInt3 (String str) throws InvalidNumberException2 {
		
		try {
			return Integer.parseInt(str);
		}
		catch (NumberFormatException nfe) {
			
			System.out.println(str + "은 숫자로 바꿀 수 없습니다.");
//			throw nfe;
			InvalidNumberException2 ine2 = new InvalidNumberException2(str + "은 숫자로 바꿀 수 없습니다.");
			throw ine;
			
		}
	}
	
//	RuntimeExeption : InvalidNumberException
	public int parseInt4 (String str) {
		
		try {
			return Integer.parseInt(str);
		}
		catch (NumberFormatException nfe) {
			
			System.out.println(str + "은 숫자로 바꿀 수 없습니다.");
//			throw nfe;
			InvalidNumberException ine = new InvalidNumberException(str + "은 숫자로 바꿀 수 없습니다.");
			throw ine;
			
		}
	}
	
}
