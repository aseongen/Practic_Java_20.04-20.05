class Member13{
	String id; //아이디 =>기본값 null
	String name; // 회원이름
	int age; //나이  => 기본값 0
    boolean result;//기본값 false
    
    //생성자 == 클래스 name
    Member13(){
    	id="aaa"; name ="이순신"; age=25;
   /*생성자의 주된 기능)
    *  new 클래스명()에 의해서 호출되는 멤버변수 직접 초기화
    */
    	
    }
    void print() {
    	System.out.println("아이디: " + id + ", 이름: " + name + ", 나이: " + age);
        System.out.println("result: " + result);
    }
}

public class ObjectTest14 {
	public static void main(String[] args) {
      Member13 m=new Member13();
	  m.print();
		
		
	}

}
