final class Last17{} //final 클래스는 더이상 상속을 허락하지 않는다. 

//class Child17 extends Last17{} -> 상속 안됨 에러남
class Father17{
	final void p() {} 
	
}
//final 메서드는 자손 클래스에서 오버라이딩을 허용하지 않는다. 
/*class Child18 extends Father17{
	@Override
	void p() {}
}*/


public class FinalTest17 {
	public static void main(String[] args) {

	}
}
