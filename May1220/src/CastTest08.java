class Parent08{
	int a = 100;
	
	void m() {
		System.out.println("조상 클래스 메서드 m()");
	}
	
}//Parent08 class

class Child08 extends Parent08{
	int a =200;
    int b = 300;
	
	@Override
	void m() {
		super.m(); // 조상클래스 메서드 참조 
		System.out.println("a= " +a);//this. 이 생략됨
		System.out.println("this.a = " +this.a); //this.a로 접근할 때는 자손 클래스에서 선언된 멤버변수에 접근한다.
		System.out.println("super.a = " + super.a); 
		//super.a 는 조상클래스에서 선언된 멤버변수가 상속되면 해당변수에 접근할 때 사용한다.
//	    System.out.println("super.b = " + super.b); //this.b or b로 접근해야한다. 
	}
}

public class CastTest08 {
	public static void main(String[] args) {

		Parent08 p = new Child08(); //업캐스팅
		p.m();
		System.out.println(p.a);
/*문제)
 * Child 08 ch 타입으로 다운캐스팅 한다음
 * m(),a멤버 변수를 각각 호출해 원하는 값을 출력해본다
 * 
 */
		System.out.println();
		if (p instanceof Child08) {
		   Child08 ch = (Child08)p;
		   System.out.println(ch.a);
		   ch.m();
		}else {
			System.out.println("다운캐스팅 불가함.");
		}
		
	}
}
