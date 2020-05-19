package TryCatch;

/*
 * 변수 소속 (인스턴스, 정적변수)
 * UI 이벤트 처리코드 : 익명클래스
 * try~catch 
 */

class Member{
	String id = "aaaa";
	String name = "홍길동";
	
			
}//Member
public class TryCatch04 {
	public static void main(String[] args) {

    Member m = null;
    
    try {
    	//호출은 되지만, m 참조변수에는 번지 객체 주소 자체가 저장이 안된다. 
    	System.out.println(m.id+ " , " + m.name);
    	
    }catch(Exception e) {
       System.out.println("예외 발생: " + e);	
       
       m = new Member();//객체주소가 저장된 참조변수  -> 객체명
       System.out.println("ID: " + m.id+", 이름: " + m.name);
    }//try~catch
    
	}//main
}//class 
