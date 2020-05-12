class Father01 {
	void f01() {
		System.out.println("조상 클래스 f01 () 메서드");
	}
}// Father01 class

class Child01 extends Father01 {
	void ch01() {
		System.out.println("자손 클래스 ch01() 메서드");
	}
}

public class CastTest01 {

	public static void main(String[] args) {

		Child01 ch = new Child01(); 
		ch.f01();//상속받아서 호출
		ch.ch01();// 자손 클래스 메서드 호출
		
		Father01 f ; // 조상클래스 타입으로 참조변수 선언
		f=ch; //업캐스팅 => 업캐스팅은 상속관계에서 자손 타입으로 올리는 것을 말한다. 자동형변환을 한다.
		f.f01() ; 
		//f.ch01(); ->에러남
		
		Father01 f02 = new Child01(); //업캐스팅
		//부모 클래스를 자식에게 캐스팅함.
		f02.f01();
		
	}

}
