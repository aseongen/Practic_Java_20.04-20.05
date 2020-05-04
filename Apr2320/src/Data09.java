
public class Data09 {
	public static void main(String[] args) {

		long longValue = 500L;
		int intValue = (int)longValue; 
		//(int)캐스팅(형변환)연산자를 사용하여 명시적인강제 형변환
		// long -> int
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue; //3.14 -> 소수점이하 버림 정수만 저장
		System.out.println(intValue);
	
		doubleValue = 85.9;
		intValue =(int)doubleValue; //반올림 하지 않고 소수 버림 정수값만 취함
	    System.out.println(intValue);	
		
		
		
	}
}
