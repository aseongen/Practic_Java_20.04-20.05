
public class ObjectTest06 {
	public static void main(String[] args) {

		String ssn = "0100624-3******";
		char m = ssn.charAt(7);//charAt(7)은 8번째 자리 즉, 주민번호 뒷자리 첫번째 단일 문자를 구함.
		
		switch(m) {
		case'1' : case'3' : System.out.println("남자"); break;
		case'2' : case'4' : System.out.println("여자"); break;
		}//switch(m)
		
		String strVar1 = new String("홍길동");//새로운 문자열 객체 strVar1을 생성함. 
		String strVar2 = "홍길동"; //그러므로 strVar1과 strVar2는 번지 주소가 다르다. 
		
		if(strVar1 == strVar2) { //문자열을 ==로 비교하면 번지주소를 비교 
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		} //if else
		
		if(strVar1.equals(strVar2)) {
			//문자열 내용만 비교
			System.out.println("문자열 내용이 같다");
		}else {
			System.out.println("다르다");
		} //if else
	    
	}//main

}
