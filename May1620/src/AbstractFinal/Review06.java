package AbstractFinal;
/* final  특징)
 * 변수를 final 로 선언하면 수정할 수 없는 변수 즉 상수가 된다.
 * 상수는 선언과 동시에 초기화를 진행해야하고 관례적으로 영문대문자로 한다.
 */

abstract class Cookie{
	String flavor;
	
	//추상클래스: 일반 변수 올 수 있음
	Cookie(String flavor){
		this.flavor=flavor;
	}
	void mixing() {
		System.out.println("반죽을 섞습니다.");
	}
	void shaking() {
		System.out.println("반죽을 흔듭니다.");
	}
}//Cookie

class Bread extends Cookie{
	//조상  추상 클래스 생성자 호출 
	Bread(String flavor){
		super(flavor);
	}
	void display(){
		System.out.println("빵을 전시합니다.");
	}
	void kinds() {
		System.out.println("밀가루 종류: "+ flavor);
	}
}//Bread

public class Review06 {
	public static void main(String[] args) {
		
		//업캐스팅 
		Cookie ck = new Bread("호밀");
		ck.mixing(); ck.shaking();
		System.out.println();
		
		//다운캐스팅
		Bread bd = (Bread)ck;
		bd.display(); bd.kinds();
		System.out.println();
		
	}

}
