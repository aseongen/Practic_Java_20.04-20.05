//상속에서 생성자
//자바 기본 패키지 경로  java.lang
/* object 클래스는 조상이 없다 : 최고 조상 클래스 
 * 해당클래스 멤버 변수중 인스턴스 변수 초기화 -> 생성자 기능 
 * 생성자는 상속이 안됨 -> 오버라이딩 자체가 안됨
 */

class Father06{
	public Father06() {
		super(); // 묵시적 생략을 해도 된다. 조상클래스 object 기본생성자 호출
		System.out.println("Father06 () 생성자 호출 ");
	}
	
}

class Child06 extends Father06{
	public Child06() {
		//super(); 생략 -> 조상 Father06() 기본 생성자를 먼저 호출
		System.out.println("Child06 () 생성자 호출 ");
	}
}
public class FinalTest06 {

	public static void main(String[] args) {
		new Child06(); // 기본 생성자 호출 
		
	}
	
}
