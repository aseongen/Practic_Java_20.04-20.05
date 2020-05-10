//참조형 매개변수  
class Data2{
	int x;
	}


public class OopStudy1 {
	
	static void change(Data2 d) { // 참조형 매개변수 
		d.x=1000;
		System.out.println("change x = "+d.x);
	}
	public static void main(String[] args) {
 
		Data2 d = new Data2();
		d.x=10;
		System.out.println("Data2 x= "+d.x);
		System.out.println("-----------------------");
		//메인의 d가 먼저 실행 -> change d로이동 -> 참조형 매개변수 실행 -> change(d)실행 
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() x = "+d.x);
		
	}
}
