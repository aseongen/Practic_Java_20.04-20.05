package Day14;

public class StringField {
	public static void main(String[] args) {
		
		/* "" + 숫자가 되면 자바는 문자열을 우선해서 숫자가 문자열로 변경된다. 
		 * 그러므로 "" + "1" => "1" , "1"+"2" =>"12", 
		 * String 클래스는 문자열 자체를 변경 수정 x 
		 * 새로운 객체가 만들어지면서 새로운 문자열 할당된다. 
		 * =>10개의 객체가 힙영역에 생성된다. 프로그램 속도 저하문제 발생 -> Bad Code
		 * => + : 덧셈연산자가 아닌 문자열 연결 연산자
		 */
		
		String str = "";
		for(int i = 1; i<=10; i++) {
			str+=i;
			
		} //for
		System.out.println(str);
		
		System.out.println("-----------개선 코드--------------");
		
        /* StringBuilder 클래스는 문자열 자체 변경수정 가능함.
         */
		
		StringBuilder sb = new StringBuilder();
         for(int i=1; i<=10; i++) {
        	 sb.append(i);//기존값에 추가
         }//for
    
         str =sb.toString(); //문자열 변경
         System.out.println(str);
         //개선된 코드 작성시 -> 힙 영역에 메모리가 한개만 만들어 진다.  
         
	}//main
}//class
