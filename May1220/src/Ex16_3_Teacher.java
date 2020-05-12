class Animal{
	//초기화
	//같은 패키지 다른 클래스 접근가능, 다른패키지 자식만 접근 가능 
	protected String kind;
	protected int leg;
  
	//기본생성자 초기화
	Animal(){}
	
	Animal (String kind, int leg){
		this.kind=kind; this.leg=leg;
	}
	
	public void getKind() {
		if (kind.equals("소녀")) { //equals () 메서드는 내용물 값만 비교
			System.out.println(kind+"는 사람이다.");
		}else {
			System.out.println(kind + "는 동물이다.");
		} //if else
	}//getKind()
	
	public void walk() {
		if(leg ==2) { //기본타입값을 ==로 비교하면 값을 비교
			System.out.println("사람은 " + leg + " 발로 걷는다.");
		}else {
			System.out.println(kind + "는 " + leg + "발로 걷는다.");
		}//if else
	}//walk()
}//Animal class

class Human extends Animal{
	
	//생성자 초기화
	Human () {}
	//생성자 오버로딩
	Human (String kind, int leg){
		//조상  Animal 클래스 오버로딩 된 생성자 호출 
		super(kind, leg); 
	}
}//Humal class

class Dog extends Animal{
	//생성자 초기화
	Dog () {}
	//생성자 오버로딩 
	Dog (String kind, int leg){
		super(kind,leg);
	}
}//Dog class

public class Ex16_3_Teacher {
	public static void main(String[] args) {

		Dog d = new Dog("강아지",4);
		d.getKind();
		d.walk();
		
		System.out.println("----------------------------");
		
		Human h = new Human("소녀",2);
	    h.getKind();
	    h.walk();
		
	} //main
}//class
