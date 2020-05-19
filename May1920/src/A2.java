
public class A2 {

	//인스턴스 멤버 클래스
	class B {} 
	
	//정적멤버 클래스
	//A2$C.class
	static class C {} 

    // 인스턴스 변수(필드)
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메서드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적변수(필드)
//	static B field3 = new B(); ->에러남 -> 인스턴스 멤버 클래스 B를 정적변수 초기값으로 사용할 수 없다.
	static C field = new C();
	
	//정적메서드
	static void method2() {
//		B var1 = new B(); -> 인스턴스 멤버 클래스 B를 정적메서드 내에서 객체 생성 못함. 
        C var2 = new C(); 
	}

}
