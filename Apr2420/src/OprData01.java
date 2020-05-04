
public class OprData01 {
	public static void main(String[] args) {

/* 수학/ 산술 연산자)
 * + (덧셈), - (뺄셈), * (곱셈), / (나눗셈) : 정수숫자_반올림X, % (나머지값) :나눗셈 후 나머지 
 */
    int a =10, b=4, re=0; //3 변수 선언 후 초기화 (변수를 선언하고 최초값을 저장하는 것)
    
    re = a + b;
    System.out.println(a + "+" + b + "="+ re);
    
    re = a - b;
    System.out.println(a + "-" + b + "="+ re);
    
    re = a * b;
    System.out.println(a + "*" + b + "="+ re);
    
    
	re = a / b;
	System.out.println(a + "/" + b + "=" + re);
	
	re = a % b;
	System.out.println(a + "%" + b + "=" + re);
	
	System.out.printf("%d /%f = %f \n",a,(float)b,a/(float)b ); //%n,\n 줄바꿈 
/*%d : 십진수 정수, %f : 십진수 실수 숫자 출력형태이다. 기본으로 소수점 6자리까지 표현 , 소수점 7자리에서 반올림
 * int /float -> 10/4.0f 더 큰 타입으로 변환하는 자동형 변환 (자동 산술법)에 의해서 ->10.0f / 4.0f -> 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구함.
 * 2.5f ->%f ->2.500000f
 */
	
	System.out.println("");
	
	
	
	
	
	
	}
}
