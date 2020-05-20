
public class Try06 {
	public static void main(String[] args) {

    try {
    	String data01 = args[0]; String data02 = args[1];
    	int a = Integer.parseInt(data01);
    	int b = Integer.parseInt(data02);
    	System.out.println(a + " " + b + "=" + (a+b));
    	
    }catch(ArrayIndexOutOfBoundsException ae) {
    	System.out.println("2개의 배열 원소값이 없습니다.");
    	
    }catch(NumberFormatException ne) {
    	System.out.println("정수숫자로 변환할 수 없다.");
    	
    }finally {//try~catch
    	//finally 예외오류 상관없이 실행된다
	    System.out.println("다시 실행하세요 ");
    }
    
	
	}//main
}//class
