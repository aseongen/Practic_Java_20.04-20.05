package Constructor;
//생성자
class Number03{
	int a, b, c;

	Number03(){}

	Number03(int a, int b, int c) { //public 생략가능 
		this.a = a;
		this.b = b;
		this.c = c;
	} 
	void v() {
		System.out.printf("a:%d, b:%d, C:%d",a,b,c);
	}
}
public class Review04 {
	public static void main(String[] args) {
//기본 생성자 호출
		Number03 nb3 = new Number03(); 
		nb3.v();
		
		System.out.println();
		
		Number03 nb4 = new Number03(1,2,3);
		nb4.v();
		
		
	}

}
