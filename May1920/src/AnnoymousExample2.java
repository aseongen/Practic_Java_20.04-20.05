interface RemoteControl{
	void turnOn();//public abstract이 생략된 추상메서드
	void turnOff();
}//RemoteControl

class Anonymous2{
	RemoteControl field=new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}
		@Override
		public void turnOff() {
			System.out.println("TV을 끕니다.");
		}		
	}; // 익명객체로 멤버변수 초기값으로 대입 -> 익명클래스 ->Annoymous2$1.class
	 
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
			
		};//익명 객체를 지역변수 초기값으로 대입
		//오버라이딩 된 메서드 호출
		localVar.turnOn();
		localVar.turnOff();
		
 	}//method1()
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	 }//method2
	
}//Annonymous2

public class AnnoymousExample2 {
	public static void main(String[] args) {
		
		Anonymous2 anonoy = new Anonymous2();
		  anonoy.field.turnOn();
	      anonoy.field.turnOff();
		  anonoy.method1();
		  
		  anonoy.method2(new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다. ");
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");
			}
			  
		  }); //익명클래스 => AnonoymousExample2$1.class
	}//main
}//class
