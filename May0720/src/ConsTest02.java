
class Car02{
	//멤버변수
	String company = "현대자동차";
	String model;
	String color;
	int speed;
	
	//생성자: 기본 생성자 호출 하려고
	Car02(){}
	
	Car02(String model, String color){
		this(model,color,120); //같은 클래스 내의 다른 생성자 호출 
	}
	
	Car02(String model, String color, int speed){
	    this.model=model; this.color=color; this.speed=speed;	
	}
	//메서드
    void p() {
    	System.out.println("company: "+company);
		System.out.println("model: "+model);
		System.out.println("color: "+color);
		System.out.println("maxspeed: "+speed);
    }
	
}

public class ConsTest02 {
	public static void main(String[] args) {

		Car02 c = new Car02("티볼리","회색");
		c.p();
	}

}
