abstract class Abs1{
	int a =10;
	String str = "Test";
	
	public abstract int getA();
	
	public String getStr() {
		return str;
	}
}//Abs1 class

abstract class Abs2 extends Abs1{
	
	int b=100;
	
	public abstract int getB();
	
} //Abs2 class

class AbsMain extends Abs2{

	@Override
	public int getA() {
		return a;
	}
	@Override
	public int getB() {
		return b;
	}
} // AbsMain

public class Ex18_1 {
public static void main(String[] args) {
	
	AbsMain am = new AbsMain();
	System.out.println(am.getA());
    System.out.println(am.getB());
}
}
