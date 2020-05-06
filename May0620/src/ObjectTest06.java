class Mt05 {
	void p (int a) {
		System.out.println(a);
	}
	void p (int a, int b) {
		System.out.println(a+ " " + b);
	} //매개변수 즉 전달인자 개수를 다르게 한 p() 메서드 오버로딩
	/* 메서드 오버로딩? ) 
	 * 같은 클래스 내에서 동일 메서드 명을 여러번 정의하는 것을 메서드 오버로딩이라한다.
	 * 오버로딩 메서드 구분요건)
	 *  - 메서드 소속의 매개 변수(전달인자) 개수를 다르게 한다.
	 *  - 매개변수 타입 즉 자료형을 다르게 한다.
	 *  - 매개변수 순서를 다르게 한다.
	 */
} //Mt05

class Mt06{
	int abs(int a) {
		if(a<0) {
			a=-a;
		}
		return a;
	}
	double abs(double a) {
		return a; 
	} //매개변수 타입을 다르게 한 메서드 오버로딩 
} //Mt06
public class ObjectTest06 {
	public static void main(String[] args) {

		Mt05 m = new Mt05(); //객체생성
		m.p(10); m.p(10,20);

		Mt06 m2 = new Mt06();
		int re01 = m2.abs(-10);
		System.out.println("-10의 절대값=" + re01);
		System.out.println(m2.abs(10.3));
	}
}
