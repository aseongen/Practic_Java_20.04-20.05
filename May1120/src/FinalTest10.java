class Car10{
	//멤버변수(필드, 속성) ->인스턴스변수
	private int Speed;
	private boolean stop; // boolean 타입 멤버 변수 기본값은  false
	//boolean 타입 멤버 변수의 getter() 메서드의 접두언s get 으로 시작하지 않고 is로 시작하는 것이 관례이다. 
	
	//기본 생성자 생략 
	
	public int getSpeed() { //getter () 메서드라고 통칭
		return Speed;
	}
	
	public void setSpeed(int Speed) { //setter () 메서드라고 통칭 
		if(Speed < 0) {
			this.Speed=0;
			return;
		}
		this.Speed = Speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.Speed = 0;
	}
} //class Car10

public class FinalTest10 {
	public static void main(String[] args) {

		Car10 car = new Car10();
		car.setSpeed(-50); //if 문으로 들어가서 0이출력됨
		System.out.println("현재 차 속도 : " + car.getSpeed());
		
		car.setSpeed(60);
	    if (!car.isStop()) { //!false => true
	    	car.setStop(true);
	    }
	    System.out.println("현재 차 속도 : " + car.getSpeed());
	}
}
