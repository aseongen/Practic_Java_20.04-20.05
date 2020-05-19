


public class ObjectTest08 {
	public static void main(String[] args) {

		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API 를 지원합니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        
        // 자바를 찾아서 JAVA로 변경한다.
        System.out.println(oldStr);
        System.out.println(newStr);
		
	
        String ssn = "880815 - 1234567";
        String firstNum = ssn.substring(0 , 6);
        //0이상 6미만 사이의 문자열 추춘 첫문자는 0부터시작
        System.out.println("앞자리 주문 번호: " + firstNum);
        
        String secondNum =ssn.substring(7); //7이후 마지막 문자
        System.out.println("뒷자리 주민번호: " + secondNum);
        
        
	}
}
