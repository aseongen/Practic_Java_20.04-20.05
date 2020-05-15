interface IHello{
	/* 인터페이스 특징)
	 * 1. 인터페이스는 interface 예약어로 정의한다.
	 * 2. 인터페이스에 오는 추상메서드는 public abstract 으로 인식된다.
	 * 3. 추상메서드는 {} 가없고, 실행문장이 없고, 호출 할 수 없다.
	 * 4. 인터페이스는 new예약어로 객체 생성을 못한다
	 * 5. 조상인터페이스를 자손클래스에서 implements(구현)예약어로 구현상속받는다.
	 */
 
	void hello(String name); //public abstract 이 생략된 추상 메서드 
	
}
class Hello implements IHello{//인터페이스 클래스 에서  상속할떄 오버라이딩 하지 않으면 에러발생한다. 
    String name;
    
    Hello(String name){ //매개변수에 생성자 정의 
    	this.name=name;
    }
	@Override
	public void hello(String name2) {
		System.out.println(name  + "씨 안녕"); //name 앞에 this. 생략 
        System.out.println(name2 + " 반가워요."); //
	} 
	
}

public class InterfaceTest01 {
	public static void main(String[] args) {

		 //인터페이스로 참조변수 선언 가능 -> 조상타입으로 올린 업캐스팅
		IHello ih = new Hello("홍길동");
		ih.hello("이순신");
		
		IHello ch ;
		ch = new Hello("핑구");
		ch.hello("뚜비"); 
		
		
		
		
		
	}

}
