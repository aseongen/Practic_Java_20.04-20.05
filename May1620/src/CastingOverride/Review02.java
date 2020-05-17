package CastingOverride;

/* Override)
 * 상속관계에서만 사용가능 
 * static, private, final -> 불가능 
 * 메소드 한개로 여러 객체 사용할 수 있음 
 * 
 * 다형성이란 )
 * 하나의 클래스나 함수가 다양한 방식으로 동작하는 것을 의미합니다. 
 * 오버로딩에서는 하나의 메소드로 여러 동작을 할 수 있었고, 
 * 오버라이드에서는 여러 클래스의 다른 기능을 하나의 메소드로 제어할 수 있었습니다.
 */
class Teacher02{
	void t01() {
		System.out.println("선생님, 조상 메서드");
	}
} //Teacher

class Students02 extends Teacher02{
	void st01(){
		System.out.println("학생, 자손클래스");
	}

	@Override
	void t01() {
		super.t01(); //생략가능
        System.out.println("오버라이딩 된 메서드");
	}
}//student

public class Review02 {
	public static void main(String[] args) {

		//업캐스팅
		Teacher02 th2 = new Students02();
		th2.t01();
		
		//다운캐스팅 
		Students02 st02 = (Students02)th2;
		st02.st01();
		
	}
}
