class Point999{
	int x =10;
	int y =20;
	
	Point999(int x, int y){
		this.x= x; this.y =y;
	}
}
//상속
class Point11 extends Point999{
	int z =30;
	Point11() {
		this(100,200,300); // 같은 클래스 내의 다른 생성자 호출
	}
	
    Point11(int x, int y, int z){
    	super(x,y); //조상클래스의 오버로딩 된 생성자 호출
    	this.z=z;
    } 
    void p() {
    	System.out.println("x= " + x +", y= " + y + ", z= " + z);
    }
} //class Point11
public class FinalTest09 {
	public static void main(String[] args) {

		Point11 p = new Point11();
		p.p(); //상속받아서 출력됨
		
		
		
		
		
	}
}
