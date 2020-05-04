/*변수선언법)
 * 자료형 (타입) 변수명; //변수선언
 * 변수명에 최소값을 저장하는 것을 초기화라한다.
 * 
 * 변수란? 값을 저장하는 장소 
 */
public class Data03 {
	public static void main(String[] args) {

		int year = 2020; 
		//int : 자바 정수 기본 타입, = : 대입할당연산자 
		int age = 24; //; 은 한문장 끝 
		
		System.out.println(year+"년");
		System.out.println(age+"세");
		
		int a;
		a=10;
		a=12;
		//변수 a 는 한개 값만 저장 가능하고 마지막에 저장된 값만 남는다. 
		System.out.println("a 변수의 값: " + a);
		
	/* 자바의 기본 자료형 (타입) 종류
	 * - 정수 숫자형 : byte(1),char(2),short(2),int(4),long(8)
	 * - 실수 숫자형 : float(4), double(8)
	 * - true or false 논리형: boolean
	 * 
	 * 8개 제외한 나머지 자료형을 참조타입(ReferenceType)
	 *  : 배열, 클래스, 인터페이스, 열거
	 */
      
		long d = 10L;
		System.out.println("d= "+d);
		float e = 100.5f;
		System.out.println(e);
	}
}
