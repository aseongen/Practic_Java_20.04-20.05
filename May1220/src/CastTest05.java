class HandPhone111{
	String model; //모델명
	String number; //폰번호
	
	HandPhone111(){}
	
	HandPhone111(String model, String number){
		this.model= model;
		this.number=number;
	}//생성자 오버로딩
}//HandPhone class
class DicaPhone11 extends HandPhone111{
	String pixel;//화소수
	
	DicaPhone11(String model, String number,String pixel){
		super(model,number);
		this.pixel=pixel;
	}
	void prn() {
		System.out.println("모델명: " + model + "폰번호: " + number + " 화소 수 : " + pixel);
	    //this. 생략가능 model, number, 상속받아서 사용
	}
}
public class CastTest05 {

	public static void main(String[] args) {

		DicaPhone11 dp = new DicaPhone11("갤럭시","010-222-222","1024");
		dp.prn();
		
		System.out.println("-------------------------------");
/* instanceof 연산자 특징)
 * 참조변수 instanceof 클래스타입은 해당 참조변수가 클래스 타입으로 형변환(업캐스팅 /다운캐스팅)이 가능하면 true, 가능하지 않으면 false
 * instanceof 연산자를 형변환 유무 판단 연산자
 */

		if(dp instanceof HandPhone111) {
			System.out.println("조상타입으로 업캐스팅 가능함");
            HandPhone111 hp = dp; //업캐스팅
		} //if
		
		HandPhone111 hp = new HandPhone111();
		if (hp instanceof DicaPhone11) { //hp는 사전에 업캐스팅을 하지 않았기 때문에 다운캐스팅이 불가하다.
			System.out.println("다운캐스팅 가능함");
			DicaPhone11 dp2 = (DicaPhone11)hp; //다운캐스팅 
		}else {
			System.out.println("다운캐스팅 불가함.");
		} System.out.println("---------------------------");
/*문제) 
 * hp3객체를 업캐스팅 한다음에 instanceof 연산자를 사용해서 다운 캐스팅을 한 dp3
 *  prn () 메서드로 호출하여// 모델명 : 갤럭시 폴더  폰번호:010-7777-9999, 화소수:2048 결과값을// 출력하는 코드 완성
 *  instanceof 사용이유
 *  업캐스팅 사전에 사용했는지 확인하기 위해서 
 */

		 //자체가 업캐스팅
		//업캐스팅은 조상타입 참조변수가 실제로 가리키는 클래스는 자손이기 때문에 오버라이딩을 자손 클래스에서 호출한다. 
		//인터페이스 추상클래스에서 사용이 불가하다. 
		HandPhone111 hp3 = new DicaPhone11("갤럭시폴더","010-7777-9999","2048");
		
		if (hp3 instanceof DicaPhone11) { //if 문 사용하는이유 : 사전다운캐스팅 가능유무 확인, 가능하면 true 
	     DicaPhone11 dp3 = (DicaPhone11)hp3; //명시적 다운캐스팅
	     dp3.prn();
		}
		
		System.out.println("------------------------------------------------");
		
	
		
		
		
		
		
		
	}//main
	
}
