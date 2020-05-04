
public class OprData03 {
	public static void main(String[] args) {

    char c01 = 'A'+1;
    /* 자바는 리터럴(변수에 저장되는 값) 간의 연산은 타입 변환 없이 해당 타입으로 계산한다.
     */
	System.out.println((int)c01);
	System.out.println(c01);

    char c02 = 'A';
//  char c03 = c02 + 1;(x)
//  char c03 = (int)(c02 + 1);(o)
 
    /* 변수 c02+1을하면 c2가 int 타입으로 형 변환해서 +1 과 덧셈을 한다.
     * 덧셈 결과값이 int 타입으로 나온다. 그래서 char 타입변수 c03 에 저장못한다. 
     * 문제 ) 컴파일 에러를 수정하자. 그리고 c03 변수값을 출력한다. 
     */
    int c03 = c02 + 1;
    System.out.println(c03);
   
    System.out.println("==================================================");
    
    char lowerCase='a';
    
    char upperCase = (char)(lowerCase -32) ;
    System.out.println(upperCase);
    
    /*문제)
     * 캐스팅(형변환)연산자와 뺄셈 연산자를 활용하여 영문 대문자 'A'를 구해서 Char upperCase 변수에 저장한 다음 출력
     */
	
	
	
	}
}
