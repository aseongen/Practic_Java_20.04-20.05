class Point{
	//조상
	protected int a =10;
	protected int b =20;
}

class Point3D extends Point{
	protected int a =40;
	protected int b =50;
	protected int c =60;

    public void print() {
    	System.out.println("a+" + a + ", this.b=" + b + ", c= "+ c );
    /* 1. 조상 클래스 멤버 변수 a, b 와 자손 클래스 멤버 변수 a,b 가 같은 경우 조상 클래스로 부터 상속받은 멤버변수에 접근하려면
     *    super.a, super.b 로 접근해야한다. this.b, a로 접근하면 자손 클래스의 멤버 변수에 접근한다.
     */

    System.out.println("super.a= " + super.a + ", super.b= " +super.b);
    
    }
}
public class FinalTest05 {
	public static void main(String[] args) {

		Point3D p = new Point3D();
		p.print();
		
		
		
		
		
	}
}
