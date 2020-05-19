//StringBuffer
public class ObjectTest11 {
	public static void main(String[] args) {
		
		//문자열 변경작업이 많을 경우는 StringBuffer를 사용한다.
		StringBuffer str01 = new StringBuffer();
		
		//현재 문자열 끝에 첨부
		str01.append("Java");
		System.out.println("str01의 값: " +  str01.toString());
		
		//기존 문자열 끝에 추가
		str01.append(" Programming" ); 
		System.out.println("추가된 str01: " + str01.toString());
		
		//0이상 4미만 사이의 JAVA를 NFC로 변경
		str01.replace(0, 4, "MFC");
		System.out.println("변경된str01: " +str01.toString());
		
		 //3이후부터 마지막 문자까지 반환. 첫문자를 0부터 시작 -> 공백 포함
		String str02 = str01.substring(3);
		System.out.println(str02);
		
		// 첫문자 삭제 
		str01.deleteCharAt(0); 
	    System.out.println(str01);
	}
}
