class A {
	 A() {
	//super(); 가 생략됨 -> 조상 Object 클래스의 기본 생성자를 먼저 호출, 항상 첫줄에 기입
	System.out.println("hello from a");
 }
} //class A 
class B extends A{
	public B() { //public 생략도 가능
		System.out.println("hello from b");
		//super(); ->  super() 항상 생성자 {} 블록내의 실행문장에서 항상 첫줄에 나와야한다. 
	} 
	/* 생성자는 상속이 되지 않는다.
	 * 자손에서 실행한 문장 다음에 super 생성해서 오류가 난다.
	 * super() 클래스는 조상 클래스에서  먼저 생성해야한다
	 */
}
public class Ex16_8 {
 
	A a = new B();
	//기본 생성자 호출 
}
