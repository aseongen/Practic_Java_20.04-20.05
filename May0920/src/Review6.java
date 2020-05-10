/* 클래스
 * : 설계도, 데이터+함수, 사용자 정의 함수
 * 변수의 종류)
 * 클래스 영역: 클래스 변수 cv, 인스턴스변수 iv, 
 * 메서드 영역: 지역변수 lv(클래스 이외의 영역)
 */
class Variables{
	int iv; //인스턴스 변수 instance variable
	static int cv; //클래스 변수(static 변수 + iv = cv, 공유 변수)
	
	void method() { //메서드 영역
		int lv =0; //지역변수 local variable
	}
}
class Card{
	String kind; //무늬
    int number; //숫자
    
    static int width = 100; //폭
    static int height = 250; //높이
}

public class Review6 {
	public static void main(String[] args) {
		
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "HEART"; //iv
		c1.number = 5; //iv
		
		System.out.println( );
		System.out.println("c1.kind = "+ c1.kind);
		System.out.println("c1.kind = "+ c1.number);
		
		Card c2 = new Card();
		c2.width = 200; //cv
		c2.height = 300; //cv
		
	    System.out.println();	
	    System.out.println("c2.width = " + c2.width);	
	    System.out.println("c2.height = " + c2.height);	
		
		
		
		
		
		
	}
}
