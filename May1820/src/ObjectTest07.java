
public class ObjectTest07 {
	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		/*해당 문자에서 for 가 나오는 위치 번호값을 구함, 
		 *첫 문자를 0부터 저장한다. "프로그래밍" ->3번째 위치 
		 *indexOf() 메서드는 주어진 문자열이 포함되지 않으면 -1을 반환 
		*/
		int location = subject.indexOf("프로그래밍"); //3
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련된 책이 아니군요");
		}//if else 
		String ssn = "1234561234567"; //주민번호 저장
		int length = ssn.length();//length 메서드는 문자열 길이를 반환한다.
		if( length == 13 ){
			System.out.println("주민번호 자리수가 맞습니다");
		}else {
			System.out.println("주빈번호 자릿수가 다릅니다. ");
		}
		

	}//main
}//class
