
public class Try10 {

	public static void main(String[] args) {

		String [] strArray= {"10","2a"};
		int value =0;
		for(int i =0; i<=2; i++) {
			
			try {
				value = Integer.parseInt(strArray[i]); 
				//parseInt()에 의해서 정수숫자로 바굼 ->  "2a" 를 정수숫자로 변경못해서 NumberException 이 발생 
				
			}catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("배열 주소 범위를 벗어남");
				
			}catch(NumberFormatException ne) {
				System.out.println("숫자로 변환할 수 없음");
				
			}finally {
				System.out.println(value);
			}//try ~ catch ~ finally
			
		}//for
		
	}
}
