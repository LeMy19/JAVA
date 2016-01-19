
public class OperatorTwo {
	public static void main(String[] args){
		
		double floatNumber1 = 10.5;
		double floatNumber2 = 17.7;
		double floatNumber3 = 9.98;
		//double floatNumber4;
		
		//비교연산자의 result는 boolean
		boolean result = floatNumber1 < floatNumber2 ;
		System.out.println(result);		
		
		boolean result2 = floatNumber2 < floatNumber3; 
		System.out.println(result2);
		
		boolean result3 = floatNumber1 < floatNumber2 
				|| floatNumber2 < floatNumber3;
		
		System.out.println(result3);
		
	}
}
