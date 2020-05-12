class AA{}

class BB extends AA{}
class C extends AA{}
class D extends BB{}
class E extends C {}

public class CastTest09 {
	public static void main(String[] args) {

		BB b = new BB();
		C c = new C();
		D d = new D();
		E e = new E();
		
		AA a1 = b; //업캐스팅 
		AA a2 = c;
		AA a3 = d;
		AA a4 = e;
		
		BB b1 = d;
		C c1 = e;
		
//		BB b3 = e; 상속관계 아님, 업캐스팅 불가 
//		C c2 = d; 상속관계 아님, 업캐스팅 불가 
		
		
		
		
		
		
	}
}
