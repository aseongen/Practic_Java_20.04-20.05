//디폴트 메서드 사용하는 이유 
interface MyInterface{
	void method();
    default void method2() {
    	System.out.println("MyInterface의 디폴트 메서드");
    }
}//MyInterface

class MyClassA implements MyInterface{

	@Override
	public void method() {
	   System.out.println("MyClassA-method()");
	}
}//MyClassA

class MyClassB implements MyInterface{

	@Override
	public void method() {
	    System.out.println("MyClassB-method");
	}

	@Override
	public void method2() {
        System.out.println("MyClassB-method2()");
	}

} //MyClassB

public class InterfaceTest13 {
	
	 void m (MyInterface my ) {
		my.method();
		my.method2();
	}
	
	public static void main(String[] args) {

/* 문제)
 * 각각 두 자손을 업캐스팅 하여 오버라이딩 된 메서드를 호출한다.
 */
		MyInterface my;
		my = new MyClassA();//업캐스팅 
		my.method(); my.method2();
		
		my= new MyClassB();
		my.method(); my.method2();

/* 문제2)
 * InterfaceTest13에 인스턴스 메서드로 void m (MyInterface my){} 선언하고 다형성 문법을 적용해 
 * 각각 메서드를 호출하여 같은 결과값을 나오게 한다. 
 */
		System.out.println("----------------------------");

	    InterfaceTest13 ii = new InterfaceTest13();
//        my = new MyClassA(); //업캐스팅
        ii.m(new MyClassA());
		
		System.out.println("----------------------------");
		
//        my = new MyClassB(); //업캐스팅 
        ii.m(new MyClassB());
	}//main
}

