
public class InterfaceTest08 {
	public static void main(String[] args) {

    RemoteControl rc ; //인터페이스로 참조변수 선언
    rc = new Tv();
    rc.turnOn();
	rc.setVolume(7);
	rc.turnOff();
	
	System.out.println();
	
	rc = new Audio();
	rc.turnOn();
	rc.setVolume(12);
	rc.turnOff();
	
	System.out.println("---------------------------------");
	
	/* 익명클래스(내부 무명클래스)문법이다. 
	 * 이 문법을 사용할 때는 자바 UI(그래픽 디자인)을 그리고 
	 * UI에서 이벤트를 처리할 때 사용한다. 
	 * 또한, 채팅 프로그램, 메신저 프로그램 만들때 스레드 작업을 처리할 때 활용할 수 있다. 
	 * 외부 클래스명 $번호.class 로 컴파일 된다. =>InterTest08$1.class
	 */
	RemoteControl rc2 = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("또 다시 TV을 켠다.");
		}

		@Override
		public void turnOff() {
			System.out.println("또 다시 TV를 끈다.");
		}

		@Override
		public void setVolume(int volume) {
            System.out.println("다시 설정한 볼륨크기: 7");
		}
		
	}; //익명클래스는 반드시 마지막에 세미콜론 붙여야한다.
	
	rc2.turnOn();
	rc2.setVolume(20);
	rc2.turnOff();
	
	}
}
