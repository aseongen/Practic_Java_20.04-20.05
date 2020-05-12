class HandPhone22{
	protected String model; //폰모델명
	protected String number; //폰번호
	//기본생성자 초기화
	public HandPhone22() {}
	
	//생성자 통해서 오버로딩
	//get 구지 사용안해도됨 protected -> 같은 패키지 접근 가능
	//외부에서 해당 클래스 접근 가능하기 때문에 
	public HandPhone22(String model, String number) {
		this.model=model; this.number=number;
	}
} //HandPhone22 class

class DicaPhone22 extends HandPhone22{
	protected String pixel; //화소수
	
	public DicaPhone22() {}

	public DicaPhone22(String model,String number,String pixel) {
		super(model,number);
		this.pixel=pixel;
	}
	public void prnDicaPhone() {
		System.out.println("모델명: " + model + "\t 번호: " + number + "\t 화소수: " + pixel);
	}
}//DocaPhone22 class

public class Ex16_4_Teacher {
	public static void main(String[] args) {

		 DicaPhone22 dp = new DicaPhone22("갤럭시폴더z","010-222-2222","1024");
		    dp.prnDicaPhone();
		
	}
}
