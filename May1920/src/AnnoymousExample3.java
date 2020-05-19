interface Calculatable {
    int sum();
}//Calculatable

class Anonymous3{
	private int field;//인스턴스변수
	
	void method(final int arg1, int arg2) {
		//int arg2 매개변수 int타입앞에 final 이 생략됨
		final int var1 =0;//java 8부터는 final이 생략 할 수 있음.
		int var2=0;
		
		//Anonymous3클래스의 인스턴스 변수이기 때문에10으로 변경가능함.
		field=10;
		
		//arg1, arg2 매개변수, var1, var2, 메서드 지역변수는 상수이기 때문에 수정못함. 
		
		Calculatable calc=new Calculatable() {

			@Override
			public int sum() {
				return field+arg1+arg2+var1+var2;
			}			
		};//Anonymous3$1.class
		System.out.println("합계="+calc.sum());
	}//void method
}//class Annoymous3

public class AnnoymousExample3 {
	public static void main(String[] args) {

		Anonymous3 anony = new Anonymous3();
		anony.method(0, 0);
		
	}
}
