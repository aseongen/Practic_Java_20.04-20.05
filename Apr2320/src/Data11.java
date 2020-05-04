
public class Data11 {
	public static void main(String[] args) {
		   /* 문제 1 ) 컴파일 에러를 디버깅해서 실행되는 프로그램으로 만든다. 
	      * 에러난 이유도 주석문 처리한다.
	      * 
	      * byte+byte = 자동산술법에 의해서 덧셈 연산 속도가 빠른 int 형으로 자동 형변환 해서 덧셈연산을 수행한다. 
	      * 결국, int + int = int 결과로 나온다.
	      */
     byte a = 10;
     byte b = 20;
     byte result2 = (byte)(a+b);
     int result = a+b;
  
	 System.out.println("result = " + result);
	 System.out.println("result2 = " + result2);
	 
	 /*문제 2) ch01 + ch02 덧셈 연산을 수행한 결과값 66을 출력하게 하고,
	  * 이 값을 캐스팅해서 단일 문자 B를 출력하게 한다. 
	  */
	 char ch01 = 'A';
	 char ch02 = 1;
	 
	 int num = ch01 +ch02;
	 System.out.println(num);
	 System.out.println((char)num);
     
   
	}
}
