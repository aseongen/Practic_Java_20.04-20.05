interface I{
	void play();
}
class B implements I {

	@Override
	public void play() {
	    System.out.println("play in B class");
	}
	
}
class C implements I{

	@Override
	public void play() {
		System.out.println("play in C class");
	}
}

class A {
	//다형성문법: 상속+업캐스팅 (다운캐스팅)
	void autoPlay(I i) {
		i.play();//업캐스팅 후 오버라이딩 된 메서드 호출 
	}
}

public class InterfaceTest06 {
	public static void main(String[] args) {

/*문제)
 * 오버라이딩 된 play () 메서드를 각각 호출하는 문장을 완성하세요
 */
 
		A a = new A();
		
		a.autoPlay(new B());
		
		System.out.println("----------------------");
		
		a.autoPlay(new C());

	
	}
}
