package CastingOverride;
class Teacher04{
	int a = 300;
	
	void th03() {
		System.out.println("선생님, 조상 메서드");
	}
	void th04() {
		System.out.println("선생님, 조상메서드2");
	}
} //Teacher04

class Students04 extends Teacher04{
	int a = 600;
	int b = 700;
	
	void st03(){
		System.out.println("학생, 자손클래스");
	}
} //students04

public class Review04 {
	public static void main(String[] args) {
		/*문제)
		 * 업캐스팅한 th04 객체를 생성해서 부모 클래스를 호출하고, 
		 *  instanceof  연산자를 활용해 st04다운캐스팅이 가능한지 확인한 후 thh를 생성하고, 
		 *  부모클래스를 상속 받아서 호출하고, 자손 클래스 메서드를 호출해라
		 */
		
		//업캐스팅
		Teacher04 th04 = new Students04();
		th04.th03();
		th04.th04();
		
		//다운캐스팅
		//부모, 자식 개체 다 사용가능 
	    if (th04 instanceof Students04) {
	    	System.out.println("다운 캐스팅 사용가능");
	    	Students04 st04 = (Students04)th04;
	    	st04.th03();
	    	st04.th04();
	    	st04.st03();
	    } //if 구문 
		
	}//main
}// class
