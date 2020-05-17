package AbstractFinal;
/* 추상클래스특징)
 * 추상 클래스는 미완성 설계도면으로 new 예약어로 객체생성을 못한다.
 * 추상메서드를 가진 클래스는 일반 클래스가 아닌 추상클래스가 되어야 한다.
 * 일반멤버변수(속성, 필드),일반 메서드, 추상메서드가 함께 올 수 있다.
 * 
 * 조건)
 * 1. 추상 클래스 안에 추상 메서드 생성
 * 2. 추상 메서드 오버라이딩 
 */
abstract class Function01{
	abstract void f01(); //추상메서드
	
	void abs01() {
		System.out.println("조상 일반 메서드");
	}
}//function01

class SubFun01 extends Function01{

	@Override
	void f01() {
        System.out.println("오버라이딩 된 SubFun01");		
	}
}//SubFun01

public class Review05 {
	public static void main(String[] args) {

		//자손클래스 상속 호출 : 각각 상속받아서 호출 
		SubFun01 sub01 = new SubFun01();
		sub01.abs01(); sub01.f01();
		
		System.out.println();
		
		//업캐스팅
		Function01 fun01 = new SubFun01();
		fun01.abs01();
		fun01.f01();
		
		System.out.println();
		
		//다운캐스팅
		if( sub01 instanceof SubFun01) {
		SubFun01 sub02 = (SubFun01)fun01;
		sub02.f01();
		
		}
	}
}
