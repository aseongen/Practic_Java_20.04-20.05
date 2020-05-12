class Father04{
	void f04() {
		System.out.println("f04 () 조상클래스 메서드");
	}
}//class Father04
class Child04 extends Father04{
	void ch04() {
		System.out.println("ch04() 자손 클래스 메서드");
	}
}


public class CastTest04 {

	public static void main(String[] args) {
		Father04 f = new Father04();
		f.f04();
		Child04 ch = (Child04)f;
		ch.f04();
		ch.ch04();
		/* 컴파일시 오류 발생함
		 * 클래스 자체 업캐스팅을 하지 않아서 ,
		 * why?)
		 * 다운 캐스팅 특징)
		 * - 사전에 업캐스팅을 하지 않은 상태에서 다운 캐스팅을 하면 실행시 예외 오류가 발생한다.
		 * Cgukd04 f =new Child04; -> 이렇게 해야한다.
		 */
		
	}
	
}
