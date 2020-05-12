//숙제)
//# : protected 접근제어자 
//+ :public 접근제어자
//+Animal(kind:String, leg: int ~:생성자 오버로딩 )
 //getKind() 상속관계 
//bike, speak 코드 하지 말것 


class Animal22{
	protected String kind;
	protected int leg;
	
	public Animal22 () {}
	
	public Animal22(String kind,int leg) {
		this.kind=kind; this.leg = leg;
	}
}//class Animal
class Human22 extends Animal22{

	public Human22(String kind, int leg) {
		super(kind, leg);
	}
	public void getkind() {
		System.out.println(super.kind+"는 사람입니다.");
	}
	public void walk() {
		System.out.println("사람은 "+super.leg + " 발로 걷는다.");
	}
	
}
class Dog2 extends Animal22{

	public Dog2(String kind, int leg) {
		super(kind, leg);
	}
	public void getkind() {
		System.out.println(super.kind+"는 동물입니다.");
	}
	public void walk() {
		System.out.println(super.kind+"는"+super.leg + " 발로 걷는다.");
	}
	
}

public class Ex16_3 {
	public static void main(String[] args) {

		Dog2 d = new Dog2("강아지",4);
		Human22 h = new Human22("소녀",2);
	
		 d.getkind();
		 d.walk();
		 h.getkind();
		 h.walk();
		    
		
	}
}
