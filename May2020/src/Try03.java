
public class Try03 {
	public static void main(String[] args) {

		String data01 = "100";
		String data02 = "a100";
		
		int a = Integer.parseInt(data01);
		int b = Integer.parseInt(data02); 
		//"a100"은 parseInt()에 의해서 정수숫자로 변경이 x 
		//이유) 'a' 문자는 숫자로 변경 못함 => NumberException 실행 예외 오류 발생
		
		System.out.println(a);
		System.out.println(b);
	
	    int result = a + b;
	    System.out.println(a + " " + b );
	
	}
}
