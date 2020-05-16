package Final;

//조상
class Test03 {
	protected int a = 10;
	protected int b = 20;
} //Test03

class Point extends Test03 {
	protected int a = 40;
	protected int b = 50;
	protected int c = 60;

	/*조상클래스로부터 상속받은 변수에 접근시 super.a로 접근해야한다. 
	 * 자손 클래스 멤버 변수 접근 : this.a
	 */
	public void print() {
		System.out.println("자손클래스: a+" + a + ", this.b=" + b + ", c= " + c);
		System.out.println("조상클래스: super.a= " + super.a + ", super.b= " + super.b);

	}
}//Point

public class Review11 {
	public static void main(String[] args) {

		Point po = new Point();
		po.print();
	}
}
