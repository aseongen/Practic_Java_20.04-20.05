class Car01 {
	String company;
	String model;
	String color;
	int maxspeed;

	// 생성자
	Car01() {
	}

	// 생성자 오버로딩
	Car01(String model) {
		this.model = model;
	}

	Car01(String model, String color) {
		this.model = model;	this.color = color;
	}

	Car01(String model, String color, int maxspeed) {
		this.model = model; this.color = color;	this.maxspeed = maxspeed;
	}
	
	void print() { // 인스턴스(객체) 메서드는 생성된 객체에 의해 모두 공유된다.
		System.out.println("company: "+company);
		System.out.println("model: "+model);
		System.out.println("color: "+color);
		System.out.println("maxspeed: "+maxspeed);
	}

}

public class ConsTest01 {
	public static void main(String[] args) {

		Car01 c01 = new Car01();
		System.out.println("company: " + c01.company);
        System.out.println(); //개행
        
        Car01 c02 = new Car01("자가용","빨강");
        System.out.println("C02.company: "+ c02.company);
		System.out.println("C02.model: "+ c02.model);
		System.out.println("C02.color: "+ c02.color);
		
		System.out.println("-------------------------------------");
		
		Car01 c03 = new Car01("택시","검정",200);
/*문제)
 * c03.model 로 접근하는 것은 보안상 좋지 않다.
 * Car01 클래스에 void print() {} 메서드를 정의해서 생성된 객체로 접근하여 제조사,모델,차색상,최대속도를 출력하게 코드 완성
 */
        c03.print();
		
		
	}
}
