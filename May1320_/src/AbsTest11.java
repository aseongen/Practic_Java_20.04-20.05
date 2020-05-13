abstract class Phone{
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}//추상클래스에도 일반 멤버변수, 메서드, 생성자가 올 수 있다.
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}//Phone class

class SmartPhone extends Phone{
	SmartPhone(String owner){
		super(owner); //조상추상클래스의 생성자 호출 
	}
   
	void find() {
    	System.out.println("인터넷을 검색합니다.");
    }
	
	void prName() {
		System.out.println("소유주: " + owner);
	}
}

public class AbsTest11 {
	public static void main(String[] args) {

		
/* 문제)
 * 스마트폰의 sp를 생성하면서 소유주를 홍길동으로 저장한다.
 * 소유주를 홍길동으로 저장한다.turn on turn
 * 1) 오버라이딩 , 2) 상속 자체의 클래스를 불러오는거. 
 * 
 * 추상메서드 -> 무조건 오버라이딩 해줘야함.
 */
//      Phone ph = new Phone(); -> 객체 생성 안됨 
        
		
		SmartPhone sp = new SmartPhone("홍길동");
		
		sp.turnOff(); sp.turnOn(); sp.find(); sp.prName();
		//오버라이딩을 하지 않았기에find 메서드 호출이 안된다 -> 업캐스팅을 해도 
		
/* 하단처럼 가능하지만 Phone 만 호출했기 떄문에 자식클래스는 호출이안된다.
 * 자식 클래스를 호출하고 싶으면, 다운 캐스팅으로 진행해야한다. 
 * 
 */
		Phone pp=sp;

		
		

		
		
	}

	}
