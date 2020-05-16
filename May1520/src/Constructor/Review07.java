package Constructor;
/* 인스턴스 변수, 클래스 변수, 지역 변수
 * 인스턴스 변수: 클래스 내에서 선언
 * 클래스 변수: ==정적 메서드, 클래스 내에서 생성
 * 지역 변수: 메서드 내에서 생성 
 */

class Test01 {

	// 정적
	static {
		System.out.println("정적 메서드는 딱 한번만 실행");
	}
	
	// 인스턴스
	{
		System.out.println("인스턴스 초기화 블록");
	}

	// 생성자
	public Test01() {
		System.out.println("기본 생성자");
	}
//	클래스 정적 - 인스턴스 - 생성자 - 인스턴스 - 생성자 순으로 실행 

}//Test01

class Test02 {
	int i = 10; // 인스턴스 변수 (iv)
	static int cv; // 클래스변수(cv)

	void method() {
		int lv; // 지역변수(lv)

	}
} //Test02

public class Review07 {
	public static void main(String[] args) {
		
		new Test01();
		
		System.out.println();
		
		new Test01();
	}

}
