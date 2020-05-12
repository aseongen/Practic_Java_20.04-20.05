/* 숙제
 * 핸드폰 최고 조상은 object -> 묵시적 상속 받아라  
 * 핸드폰 ;조상클래스 
 * # field 필드 두개의 멤버 변수를 받아라 
 * + HAnd 오버로딩 
 * +get(Model ) getter 메서드만 명시 setter 제외
 * 
 * 디카폰: 자손 서브 클래스 
 * #pixel : protected 
 */
class HandPhone {
	protected String model;
	protected String number;
	

	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public String getNumber() {
		return number;
	}
}

class DicaPhone extends HandPhone {
	protected String Pixel;

	public DicaPhone(String model, String number, String Pixel) {
		super(model,number);
		this.Pixel = Pixel;
	}

	public void pmDicaPhone() {
		System.out.println("모델명:" + getModel() + ", 번호:" + getNumber() + ", 화소수:" + Pixel);
	}
}

public class Ex16_4 {
	public static void main(String[] args) {

    DicaPhone dp = new DicaPhone("거원","010","512");
    dp.pmDicaPhone();
		 
	}
}
