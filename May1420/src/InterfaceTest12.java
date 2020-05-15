//다중 상속 확인 가능 
interface InterfaceA{
	void methodA();
}//A
interface InterfaceB{
	void methodB();
}//B
interface InterfaceC extends InterfaceA,InterfaceB{
	void methodC();
}//C
class Child12 implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("methodA()  실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC() 실행");
	}
}//Child12

public class InterfaceTest12 {
	public static void main(String[] args) {
		
		Child12 ch = new Child12();
		InterfaceA ia = ch; //업캐스팅
		ia.methodA();
		
		System.out.println();//개행 -> 한줄 줄바꿈, ln은 줄바꿈 기능 
		
		InterfaceB ib = ch;
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = ch;
		ic.methodA(); ic.methodB(); ic.methodC();
		
	}
}
