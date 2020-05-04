public class Data10 {
	public static void main(String[] args) {
		/*if ~else
    	 * if(조건식) {
    	 *    조건식이 참이면 실행;
    	 * } else {
    	 *   조건식이 거짓이면 실행;
    	 * }
    	 * 
    	 * 비교연산자)
    	 * > :~보다 작다  < : ~보다 크다
    	 * || 논리연산자에서 논리합 : 두개의 조건 중 한개라도 참이면 결과값은 True
    	 * 
    	 * Byte.MIN_VALUE : byte 기본 정수 자료형이 최소값
    	 * Byte.MAX_VALUE : 최대값 
    	 */
    int i =128;
    
    if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)){
    	System.out.println("byte 타입으로 형변환을 할 수 없다. 다시 한번 더 값을 확인하세요");
    } else {
    	byte b =(byte)i;//명시적인 강제 형변환
    	System.out.println(b);
      } // if~else
    System.out.println("==========================================");
	
    int num01 = 123456780;
    int num02 = 123456780;
    
    double num03 = num02; //자동형변환
    num02 = (int)num03; //명시적인 형변환
    
    int result = num01 - num02; //- 뺄셈 산술 연산기호
    System.out.println(result);
    
	}
}
