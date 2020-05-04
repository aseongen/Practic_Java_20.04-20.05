
public class OprData02 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 30;
		byte c =(byte)(a*b);
		//int + int = int ->30*10 =300 은 byte 타입을 벗어나서 잘못된 값이 저장
		System.out.println(c);
		
		// 문제)  byte 범위를 벗어나 잘못된 44를 출력한다. 원하는 300값이 출력되게 소스를 수정하시오 
		int d = a*b;
	    System.out.println(d);
	    
        int a2 = 1000000;
        int b2 = 1000000;
        long c2 = a2*b2;
        System.out.println(c2);
        
        //문제) 오류 발생한다 정확한 코드를 수정해서 곱셈 결과값을 저장하고 출력하자.
        long c3 = (long) a2*b2;
        System.out.println(c3);
	
	   
	
	}

}
