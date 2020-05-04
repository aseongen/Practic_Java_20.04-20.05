
public class Quiz4_ppt {
	public static void main(String[] args) {

//		4. char 형의 저장할 수 있는 데이터 값의 허용 범위는 얼마인가요?
//		0~65535
		
//		5. 변수 이름을 임의로 사용할 수 있는 것 : 식별자 
//		a-class 
		
//		6.  컴파일 했을 때 결과추측
		byte b =127;
		byte c = 126;
		byte d = (byte) (b+c);
		//컴파일 에러난 이유 : byte + byte = int 
		//=> 계산 에러 발생한다.  
		//byte 형 d 변수에 저장하기 위해서는 명시적인 캐스팅 연산자를 사용해서 형변환을 해야한다.
		//int  덧셈결과값을 byte타입변수에 형변환해서 저장하면 byte 타입 범위를 벗어나 잘못된 값이 저장됨 
		System.out.println(d);
	
//		7. byte 형을 저장할 수  있는 데이터 값의 허용 범위는 얼마 
//		 -128 ~ 127
		
//		8. float 형 변수 선언이 올바르게 된 것 2개만 고르시오
		float f1 =1F;
		//float f2 =1.0; -> double 실수 숫자 타입 
		float f3 ='1'; //자동형변환(자동산술법) => byte -> char (음의정수 있음) -> short (음의정수 있음) -> int -> long ->float ->double
		               //타입 순으로 형변환
		//float f4 ="1"; //D => "1"  문자열 참조타입. 기본타입과 참조타입간의 형변환은 안됨
		//float f5 = 1.0d;

		// A,C 만 가능 
		// float 타입은 상수 뒤에 f 를 붙여야한다.
		// 단일 문자도 가능하다. 
		
		
	}
}
