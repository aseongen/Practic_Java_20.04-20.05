class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 클래스의 areaCircle() 메서드 실행");
	    return 3.14159*r*r;
	}
}
class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI *r*r; //더 정확한 원의 면적이 반환
	} 
	//이클립스 메뉴로 오버라이딩 : 자손클래스에 맞게 수정하려고 재정의 단어 사용하지 말거
	//오버라이딩 :상속관계, 동일메서드명-조상에 있어야 한다 -> 전제조건 
}

public class FinalTest15 {

	public static void main(String[] args) {
     
		int r =10;
		
		Calculator calculator = new Calculator();
		System.out.println("원의 면적: " + calculator.areaCircle(r));
		//인자값 전달이 10 int ->10.0 double 타입으로 자동형변환
		System.out.println(); //개행
		
		//오버라이딩 된 메서드 호출 
		Computer computer = new Computer(); 
		System.out.println("원의 면적: " + computer.areaCircle(r));
		
		
		
		
	}

}
