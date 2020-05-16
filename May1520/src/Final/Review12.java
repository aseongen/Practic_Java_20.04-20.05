package Final;

class Test04{
	int x =0;
	int y =0;
	
	Test04(int x, int y){
		this.x=x;this.y=y;
	}
}//Test04

class Point02 extends Test04{
	int z=0;

	 Point02 (int x,int y, int z){
		 //조상클래스의 오버로딩 된 생성자 호출
		 super(x,y); 
		 this.z=z;
	 }
	 void p() {
		 System.out.println("x= " + x +", y= " + y + ", z= " + z);
	 }
}
public class Review12 {
	public static void main(String[] args) {
		
		Point02 p2 = new Point02(100,200,300);
		p2.p();
	}

}
