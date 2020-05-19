
public class ObjectTest09 {
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming ";

		System.out.println(str1.equals(str2));
		// eaiala 메소드는 영문 대소문자를 구분

		// toLowerCase() 메서드는 영문 소문자로 변경
		String lowerStr1 = str1.toLowerCase(); // toLowerCase() 영문 소문자로 변경
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));	
		     
		System.out.println();

		System.out.println(str1.equalsIgnoreCase(str2));
		// equalsCase() 메서드는 영문대소문자를 무시하고 비교

	    String tel1 = " 02";
	    String tel2 = "1234 " ;
	    String tel3 = " 5678 ";
	    String tel = tel1.trim()+tel2.trim()+tel3.trim(); //trim() 메서드:양쪽 공백 제거
	    System.out.println(tel);
	    System.out.println("-------------------------------------");
	    
	    //split
	   //정규표현식 &, - 기호로 연결된 정규표현식 인자값을 구분자로해서 문자열을 배열로 반환한다.
	    String text = "홍길동&이수홍,박연수,김자바-최명호";
	    String [] names = text.split("&|,|-"); 
	    for(int i =0; i<names.length;i++) {
	    	System.out.println(names[i]);
	    }//for
	    System.out.println("---------------------------------------");
	    
	    for(String name: names) {
	    	System.out.println(name);
	    }
	}//main
}//class 
