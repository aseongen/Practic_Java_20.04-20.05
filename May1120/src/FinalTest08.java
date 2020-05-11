class Point08{
	int x =10;
	int y =20;
	
	public Point08(int x, int y) {
		//super(); 생략 됨 -> Object 조상 클래스 기본 생성자를 호출 
		this.x=x;
		this.y=y;
	}
}

class Point09 extends Point08{
	int z =30;
	
	public Point09 (int x, int y, int z) {
		super (x,y); //조상클래스 오버로딩 된 생성자 호출
		this.z=z;
	}
	public void p() {
		System.out.println("x= "+x + ", y=" + y + ",z= "+ z);
	}
}
public class FinalTest08 {
	public static void main(String[] args) {

		
		Point09 p =new Point09(100,200,300);
		p.p();
	}
}
