
public interface RemoteControl {
 //정적상수만 올 수 있다.
	int MAX_VOLUME =10; //최대볼륨값 -> public static final 이 생략된 정적 상수 
	
	public static final int MIN_VOLUME = 0; //최소 볼륨
	
	//추상메서드
	void turnOn(); //public abstract가 생략된 추상 메서드 
	void turnOff();
	void setVolume(int volume);
	
	//자바 8버전에서 추가된 Default method
	default void setMute (boolean mute) {
		if(mute) {//==true 생략됨
			System.out.println("무음처리합니다.");
			
		}else {
			System.out.println("무음해제 합니다.");
		}
	}//setMute
	// 인터페이스 자바 8부터 올 수 있는 정적 메서드 
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
