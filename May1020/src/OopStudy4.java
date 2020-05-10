class MyMath2{
	long a,b; //인스턴스 변수
	
	long add () { //인스턴스 메서드
		return a+b; //a,b : 인스턴스변수
	}
	
	static long add(long a, long b) { //static메서드
		return a+b; //a,b 지역변수, 유효범위: static메서드 
	}
}
public class OopStudy4 {
public static void main(String[] args) {
/* 클래스 메서드는 객체를 생성하지 않기 때문에 
 * 클래스 그 자체를 호출한다.
 * 즉, Static 메서드란? 객체 생성 없이 호출가능한 메서드이다.  
 */
	System.out.println("클래스 메서드 호출 : "+ MyMath2.add(200L, 100L));
/* 인스턴스 메서드
 * 인스턴스 메서드는 반드시 객체를 생성하고 값을 저장해 호출한다.
 * =>정적 메서드는 iv 사용하지 않을때, 사용하는 메서드 
 * =>정적 메서드는 iv 변수와 메서드를 사용할 수 없다. 
 */
	MyMath2 mm = new MyMath2(); //인스턴스 생성
	mm.a = 550L;
	mm.b = 330L;
	System.out.print("인스턴스 메서드: ");
	System.out.println(mm.add());//인스턴스 메서드 호출 

}
}
