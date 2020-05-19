package TryCatch;

public class TryCatch05 {
	public static void main(String[] args) {

    int[] num = {10,20,30};
    
    try {
    	System.out.println("Test -1");
    	num[4] =50;//배열 주소 범위를 벗어남 -> 예외발생 (ArrayIndexOutOfBoundsException)
    	System.out.println("test - 2 "); //-> 실행안됨
    	
    }catch(Exception e) {
    	System.out.println("예외 발생: " + e);
    }//try~catch
	
	
	
	}
}
