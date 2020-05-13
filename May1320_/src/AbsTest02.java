/*class Abs02{
	//추상메서드 
	abstract void p(); - >3번 으로 인해 오류 
 추상클래스 특징)
 * - 추상메서드는 {} 가 없고, 실행문장이 없고 ,호출이 불가능하다.
 * - 추상메서드는 abstract 예약어로 정의
 * - 일반 클래스에는 추상메서드가 올 수 없다. 추상메서드를 가진 클래스는 일반 클래스가 아닌 추상클래스가 되어야 한다.
 * - 추상 클래스에도 일반멤버변수(속성, 필드),일반 메서드, 추상메서드가 함께 올 수 있다.
 * 
}*/
abstract class Abs03{
	int a =10; //일반속성, 멤버변수, 필드 
	
	void p () {} //일반메서드
    abstract void p2();//추상메서드

    
}

public class AbsTest02 {
	public static void main(String[] args) {

	}
}
