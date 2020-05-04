
public class OprData06 {
	public static void main(String[] args) {

	/* 비교/관계 연산자 종류)
	 * 비교 연산자 결과 값은 boolean 타입이다. true or false
	 * > (~보다크다), >=(~보다 크거나 같다), < (~보다 작다), <=(~보다 작거나 같다)
	 * == (같다) != (같지 않다)
	 */
 
		int a=10 , b=4;
		boolean re = false;
		
		re=a>b; //10>4
		System.out.printf("a>b \n",re);
		
		re=a<b;
		System.out.printf("a<b \n",re);
		System.out.println(a+b > a-b);
		 
	/* 삼항 조건 연산자 형식)
	 * 조건식? 조건식이 참 실행 : 조건식 거짓 실행;
	 * 간결한 코드를 만들어 준다.
	 */
		
       int aa =5, bb=10;
       int max=(aa>bb)? aa:bb;
       System.out.println("max =" + max);
       
	}
}
