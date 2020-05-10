/* 오버로딩
 * 메서드 이름이 같아야 한다.
 * 매개변수 개수 또는 타입이 달라야 한다
 * 반환 타입은 영향없다. 
 */
class Ps{
//void 리턴값이 없다. 
	void p1 (int a) {
		System.out.println("p의 값: "+ a);
	}
	void p1 (int a, String b) {
		System.out.println("p의 a,b의 값: "+a + ", " + b);
	} 
}//class ps
//매개변수를 다르게한 메서드 오버로딩
class Ps2 {
	int abc (int a) {
		return a;
	}
	double abc (double a) {
		return a;
	}
}//class ps2

public class OopStudy7 {
	public static void main(String[] args) {

		Ps p = new Ps();
		p.p1(15); p.p1(25,"String");
		
		System.out.println("----------------");
		
		Ps2 s = new Ps2();
		System.out.println("Ps2의 abc,int: "+ s.abc(10));
		System.out.println("Ps2의 abc,double: " +s.abc(15.6));
	}
}
