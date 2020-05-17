package Interface;

/* 인터페이스 특징)
 *  인터페이스에 오는 추상메서드는 public abstract 으로 인식된다.
 *  추상메서드는 {} 가없고, 실행문장이 없고, 호출 할 수 없다.
 *  조상이 없다. 생성자를 가질 수 없다. new예약어로 객체 생성을 못한다
 *  implements(구현)예약어로 구현상속받는다.
 */
interface Dessert{
	void choco(String name);//public abstract 생략 
}//Dessert

class Coffee implements Dessert{
	String name;

	//자손클래스 생성자 
	Coffee (String name){
		this.name=name;
	}
	
	@Override
	public void choco(String name2) {
		System.out.println(name+" 초코");
		System.out.println(name2+" 초코2");
	}
}//coffee

public class Review01 {
	public static void main(String[] args) {

		//업캐스팅
		Dessert ds = new Coffee("바닐라");
		ds.choco("딸기");
		
		System.out.println();
		
		Dessert ds02 = new Coffee("민트");
		ds02.choco("밀크");
		
		
		
	}
}
