class Board16{
	String name;
	String title; //String 타입 멤버 변수 기본값은 null
	
	Board16(){}//기본 생성자
	
	Board16(String name,String title){
		this.name = name; this.title =title;
		
/*왼쪽의 멤버변수 중 인스턴스 변수와 오른쪽 매개변수(전달인자)명이 같을 때는
 *자바 컴파일러가 어떤것이 멤버변수이고 매개변수인지 구분하기 어렵다.
 *그래서 매개변수 값이 멤버변수에 저장안됨.
 *
 *this 예약어) -> 관례적 법칙 
 *this 예약어는 내자신 클래스(Board16)에 선언된 멤버변수 중 인스턴스 변수를 가리키는 참조 변수이다.
 *왼쪽 멤버변수 명 앞에 this.을 붙이면 해당 클래스 소속이라는 것을 알려주고, 
 *오른쪽 해당 변수는 생성자소속의 매개변수명으로 구분되어지기 때문에 값이 저장된다.
 */

	}// 생성자 오버로딩
	
	void p() {
		System.out.println("이름: " + name);
		System.out.println("제목: " + title);
	}
}

public class ObjectTest17 {
public static void main(String[] args) {
	
	Board16 b = new Board16();
	b.p();
	
	Board16 b2 = new Board16("이순신", "게시판");
	b2.p();
	
}
}
