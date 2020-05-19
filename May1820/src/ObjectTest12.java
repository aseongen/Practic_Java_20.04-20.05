
public class ObjectTest12 {
	public static void main(String[] args) {
/* 래퍼(Wrapper: 포장하다) 클래스란?)
 * 1. 래퍼 클래스는 자바의 기본타입 8개를 포장해서 클래스화 한 것을 말한다.
 *  (래퍼 클래스의 종류)
 *  기본타입       래퍼클래스
 *  byte     Byte    (1)
 *  short    Short   (2)
 *  char     Char    (2)
 *  int      Integer (4)
 *  long     Long    (8) 
 *  float    Float   (4)
 *  double   Double  (8)
 *  boolean  Boolean
 *  
 *  자바 5에서 추가된 오토박싱(자동박싱), 오토언박싱(자동언박싱)이란?)
 *  1. 오토박싱은 기본타입을 참조 래퍼클래스 타입으로 자동형 변환을 뜻한다.
 *  2. 오토언박싱은 참조 래퍼클래스 타입을 기본타입으로 변환하는 것을 말한다. 
 */
		
    //기존 int 타입값 100이 참조타입 Integer obj 변수에 대입 -> 오토박싱	
	//intValue() : 메서드는 기본타입 정수 숫자로 변환 
	Integer obj = 100;
	System.out.println(obj.intValue());
	
	//오토 언박싱  : 참조타임을 기본타입으로 변경 
	int value = obj;
	System.out.println("오토언박싱된 value = " + value);
		
	//연산시 오토 언박싱 되면서 덧셈 
	int result = obj + 100; 
	System.out.println("resutl = " + result);

	System.out.println();
	//문자열 10을 정수 숫자로 변경
	int value1 = Integer.parseInt("10"); 
	System.out.println(value1);
	
	//문자열 10.3을 실수 타입으로 변경
	double value2 = Double.parseDouble("10.3");
	System.out.println(value2);
	
	
	
	
	
	
	}

}
