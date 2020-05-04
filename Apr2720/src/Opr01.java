
public class Opr01 {

	public static void main(String[] args) {

/* + 연산기호 특징)
 *  숫자+ 숫자 = 덧셈
 *  숫자 + 문자 =문자를 우선해서 숫자가 문자열로 변경
 *  문자+문자 = 연결 
 */
		 String str01 = "JDK " + 6.0;
		 String str02 = str01 + " 특징";
		 System.out.println(str02);
		 
		 String str03 = "JDK" + 3 + 3.0;
		 System.out.println(str03);
		 
		 String str04 = 3+3.0 + "JDK"; 
		 // 3.0+3.0 -> 6.0 + "JDK" => "6.0" + "JDK" => 6.0JDK 
		 
		 
		 
		 
		
		 
		 
	}

}
