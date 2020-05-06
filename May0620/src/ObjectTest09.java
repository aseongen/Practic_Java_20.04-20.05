class MyDate{
	int year = 2019;
	int month= 12;
	int day  = 31;
	
}

public class ObjectTest09 {
	public static void main(String[] args) {

	int x = 7;
	int y = x; //값만 저장, 주소 공유 x 
	MyDate d = new MyDate();//new 로 새로운 객체를 만들면 이 참조변수에는 주소값이 저장된다.
	System.out.println("x= " + x + " y= "+ y);
	System.out.println(d.year+"년 " + d.month+"월 " + d.day+"일");
	
	MyDate t = d;// t참조변수에 d 객체주소를 저장함. t와 d는 같은 객체주소를 사용함 **참조타입은 무조건 주소를 공유한다.
	t.year = 2020; t.month = 5; t.day = 30;
    System.out.println(d.year+"년 " + d.month+"월 " + d.day+"일");
    System.out.println(t.year+"년 " + t.month+"월 " + t.day+"일"); //같은 주소를 공유하기 때문에 d로 접근하는 멤버 변수값도 함께 변경됨
    
    y =10;//기본타입 변수는 주소값을 공유하지 않기 때문에 x 변수값에 영향을 미치지 않는다. 
    System.out.println("x= " + x + ", y= "+ y );
    
	}
}
