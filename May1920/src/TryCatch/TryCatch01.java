package TryCatch;
/* 예외 처리 방법)
 * try{
 *   정상구문이 실행 되다가 예외가 발생하면 실행을 멈추고 제어가 catch {}블록으로 옮겨진다.
 *   } catch(예외 처리 클라스){
 *   예외처리 문장;
 *   } 
 */


public class TryCatch01 {
	public static void main(String[] args) {

		int a =10, b01=0, b02=2, result=0;
		
		try {
		    result =a/b02;
		    System.out.println(result);
		    
		    result =a/b01;//예외가 발생  -> 정수숫자10을 0으로 나누면 예외가 발생한다. 
		    System.out.println(result); //이 문장은 실행 안함 
		    
		}catch(Exception e){
			System.out.println("예외처리: " + e);
		}//try~catch
		
	}//main
}//class
