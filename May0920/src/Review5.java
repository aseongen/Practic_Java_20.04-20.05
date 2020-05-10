//메인메서드를 갖고 있는 클래스가 파일명과 일치해야한다. 
//그러지 않을 경우 에러 발생
class Tv{
	//TV 속성 (멤버변수)
	String color; //색상
	boolean power; //전원상태
	int channel; //채널
	
	void power() {power= !power;} //TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp () {++channel;} //TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;} //TV의 채널을 낮추는 기능을 하는 메서드
}

public class Review5 {
	public static void main(String[] args) {

		Tv t = new Tv(); //TV 인스턴스를 참조하기 위한 변수 t를 선언
		t.channel =7;
		t.channelDown(); //TV인스턴스의 멤버변수 channel의 값을 낮춘다
		t.channelUp(); //TV인스턴스의 멤버변수 channel의 값을 높인다.
		
		System.out.println("현재 채널은" + t.channel + "입니다.");
	}
}
