class Father06{
	void f06() {
		System.out.println("조상클래스 메서드 f06()");
	}
}//Father06 class

class Child06 extends Father06{
	
//오버라이드 
	@Override
	void f06() {
		System.out.println("오버라이딩 된 메서드 f06()");
	}
	void ch06() {
           System.out.println("자손 클래스 메서드 ch06()");
	}
	
	
}//Child06
public class CastTest06 {
	public static void main(String[] args) {

		Father06 f = new Child06(); //업캐스팅
		f.f06(); //f가 가리키는 실제 객체타입이 Child06이기 때문에 오버라이딩 된 메서드를 호출 
		Father06 f2 = new Father06();
		f2.f06();//조상 클래스 메서드 호출
		Child06 ch=(Child06)f; //다운캐스팅
		ch.f06();
		ch.ch06();
	}
}
