interface Vehicle{
	void run();
}
class Anonymous4{
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
		   System.out.println("자전거는 달립니다. ");
		}
		
		
	};//익명클래스 -> Anonymous4$1.class
	
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
			   System.out.println("승용차가 달립니다.");	
			}
			
		}; //Anonymous4$2.class
		localVar.run();
	}//method1()
	
	void method2(Vehicle v) {
		v.run();
	}
	
}//Anonymous4

public class AnnoymousExample4 {
	public static void main(String[] args) {

		Anonymous4 anony = new Anonymous4();
		anony.field.run();
		anony.method1();
		
/* 문제)
 * 메서드 인자값으로 익명객체 문법을 사용하여 '트럭이 달립니다'가 출력되게 만들어보자
 */
		anony.method2(new Vehicle () {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		}); //익명클라스

				
	}//main
}//class
