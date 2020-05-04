
public class Opr04 {

	public static void main(String[] args) {

		
	int charCode = 'A';
	
/* if  조건문)
 * if(조건식){
 *  조건식이 참이면 실행;
 *  } 
 */
	if (( charCode >=65 ) & (charCode <= 90)){
		System.out.println("영문대문자");
	} //if
	
	if ((97 <= charCode) && (charCode <= 122)) {
		System.out.println("영문소문자");
	}
	
	if (!(charCode < 48) && !(charCode >57)) { //48 이상 57 이하일때 참
		System.out.println("0~9사이 숫자");
	}
	
	/*문제
	 * 6을 2 또는 3으로 나눈 나머지값이 무엇일때, 2또는 3의 배수이다. 라고 출력
	 */
	int a =6;
	if ( (a % 2 == 0) || (a % 3 == 0)) {
		System.out.println("2또는 3의 배수이다");
	} //앞부분만 T 뒤쪽 연산 x
	
	if((a %2 ==0 ) |(a%3==0)) {
		System.out.println("2또는 3의 배수이다");
	} //둘다 연산한다. 
	
	
	
	
	
	


	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
