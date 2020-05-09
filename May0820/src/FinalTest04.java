/* 오버로딩 vs 오버라이딩
오버라이딩 :상속 개념 
                전제 조건 ) 상속관계 필수 
                재정의랑은 상관 x 
오버로딩: 한 클래스에서 중복해서 정의하는것 
                매개변수 기준 - 개수 다르게 -타입 다르게 - 순서 다르게
 */
class Parent04{
	public void p04() {
		System.out.println("조상클래스 메서드 p04()");
	}
}
//상속 
class Child04 extends Parent04{

	@Override
	public void p04() {
		super.p04();
/* 1. super 예약어는 상속관계에서 자손클래스에서 조상 클래스로부터 상속받은 멤버변수를 가리키는 참조변수다.
 *    조상 클래스 타입이다. 
 * 2. this 는 상속과 관련이 없다. super 는 상속과 관련 있다. 
 * 
 */
	System.out.println("오버라이딩 된 메서드 ");	
	}
/* 메서드 오버라이딩 이란)
 * 1. 오버라이딩을 할려면 사전에 상속관계를 만들어야 한다. 
 * 2. 오버라이딩이란 상속관계에서 조상클래스 메서드 이름, 리턴 타입, 매개변수 타입, 개수 , 순서 등 모두 동일한 원형을 
 * 그대로 자손으로 상속받은 상태에서 자손 클래스에 맞게 {} 내의 본문 내용 실행문장을 변경하는 것. 
 * 
 */
	
}

public class FinalTest04 {
	public static void main(String[] args) {

		Child04 ch = new Child04();
		ch.p04(); //오버라이딩 된 메서드 호출 
		
		
	}
}
