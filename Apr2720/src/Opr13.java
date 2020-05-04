import java.util.Scanner;

public class Opr13 {

	public static void main(String[] args) {

/* switch ( 정수식 ){
 * case 값 1 : 정수식과 값1 이 일치하면 실행 ; break;
 * case 값 2 : 정수식과 값2 이 일치하면 실행 ; break;
 * ....중략.....
 * default : 해당사항 없을때 실행;
 * }
 * 
 * break 문을 만나면 switch case 다중 선택문을 종료한다. 
 * 
 */
	
		//선택한 num 을 기준으로 모든 권한을 제공한다. 
		Scanner sc = new Scanner (System.in);
		System.out.print("1~9사이 정수만 입력하세요 >>> ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(!(1 <= num && num <=9)) {
			System.out.println("1~9사이 정수값만 입력하세요 "); //유효성 검증
		}else {
			switch ( num ) {
			case 9: System.out.println("최고 관리자");
			case 8: System.out.println("두번째 관리자");
			case 7: System.out.println("세번째 관리자");
			case 6: System.out.println("네번째 관리자");
			default : System.out.println("일반사원");
			}//switch case 문에서 break 문이 없는 경우는 주로 관리자 권한 설정할 때 많이 사용한다. ***
		}//if else
	}

}
