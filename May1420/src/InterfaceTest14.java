import net.daum.model.Soundable;
import net.daum.model12.Cat;
import net.daum.model12.Dog;

public class InterfaceTest14 {
	void PrintSound(Soundable sound) {
		System.out.println(sound.sound());
		
	}
	public static void main(String[] args) {

/*문제)
 * 1. net.daum.model 패키지를 생성하고 soundable 인터페이스를 정의하고 추상메서드로 String Sound();
 * 2. net.daum.model12 패키지를 생성하고 soundable 인터페이스를 구현상속한 자손클래스Cat,Dog를 생성한다.
 *     그리고 오버라이딩 된 메서드 실행문장 결과로 야옹 , 멍멍
 * 3. InterfaceTest에서 void PrintSound(Soundable sound) {} 인스턴스 메서드를 정의하고 
 *     다형성 문법을 적용해서 야옹과 멍멍을 각각 출력해분다.
 */
		InterfaceTest14 it = new InterfaceTest14 ();
		it.PrintSound(new Cat());
		it.PrintSound(new Dog());
	
	}

}
