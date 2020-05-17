package Interface;
interface A{
	void methodA();
}//A
interface B{
	void methodB();
}//B
interface InterfaceC extends A,B{
	void methodC();
}//C
class Children implements InterfaceC{

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
}//Childern
public class Review05 {
   public static void main(String[] args) {
	
	   Children ch = new Children();
	   A iA = ch;
	   iA.methodA();
	   
	   System.out.println();
	   B iB = ch;
	   iB.methodB();
	   
	   System.out.println();
	   Children iC = ch;
	   iC.methodA(); iC.methodB(); iC.methodC();
	   
}
}
