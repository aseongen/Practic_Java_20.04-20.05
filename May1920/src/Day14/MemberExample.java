package Day14;
class Member02{
	private String id; //회원 아이디
	private String name; //회원 이름
	
    Member02(String id, String name){
    	this.id = id; this.name = name; 
     //왼쪽 오른쪽 구분이 되지 않아서 꼭 this (내 자신 클래스에서 선언된 인스턴스 변수이며 상속과 관련 없다)
    }//생성자 오버로딩 되면 매개변수가 없는 기본 생성자를 자바 컴파일러는 묵시적 제공하지 않는다. 생성자에는 오버로딩밖에 없다
   
    /* 문제)
	 * '아이디 :aaaa, 이름: 홍길동 이 출력되게 추가코드를 한다.
	 */
    
	@Override
	public String toString() {
		return "아이디 = "+ this.id + " 이름= " + this.name;
	}
   
}
//getter setter 할필요 없다 . 메인에서 이미 정의 했기 때문에
public class MemberExample {
	public static void main(String[] args) {
	
		Member02 mem = new Member02("aaaa", "홍길동");
		System.out.println(mem.toString());
	}

}
