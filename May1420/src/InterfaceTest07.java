interface I7 {
    public abstract void methodB();
}//I7

class B7 implements I7 {

	@Override
	public void methodB() {
		System.out.println("methodB in B7 class");
	}//B7

//문제)object 최고 조상 클래스의 toString () 메서드를 이클립스메뉴로 오버라이딩
	
	@Override
	public String toString() {
		return "class B";
	}	
}//B7

class InstanceManager {
	public static I7 getInstance() {
		return new B7();
	}
}//InstanceManager

class A7{
	void m() {
		I7 i =InstanceManager.getInstance(); //업캐스팅한 i를 구함
		i.methodB();//업캐스팅 후 오버라이딩 된 메서드 호출
		System.out.println(i.toString());
	}
}//A7

public class InterfaceTest07 {
	public static void main(String[] args) {

		A7 a =new A7(); a.m();
	}
}//public class
