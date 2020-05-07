class Car03{
	int gas; //필드 => 멤버 변수 중 인스턴스 변수, 속성
	
	//매개변수가 없는 기본생성자를 자바 컴파일러가 묵시적제공을 한다.
	
	////setter() 메서드 => 값 저장 메서드  =>  set + 멤버변수명() 접미사로 붙는 멤버변수 첫글자는 영문 대문자 사용 
	void setGas(int gas) {
		this.gas=gas; 
	}//setter()
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
			
		}
		System.out.println("gas가 있습니다.");
		return true;
	}//isLeftGas() 메서드
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;//가스 잔량은 1씩 감소
			}else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
			    return; // 반
			}
		}//무한루프문 => 영원히 반복하는 문
	}//run()
}
public class ConsTest04 {
	public static void main(String[] args) {

		Car03 myCar =new Car03();
		
		myCar.setGas(0); //가스주입
		boolean re = myCar.isLeftGas();
		
		if(re==true) { //==true 생략 가능 
			System.out.println("출발합니다.");
			myCar.run();
		}
	    if(myCar.isLeftGas()) { //==true 가생략됨
	    	System.out.println("gas주입할필요가 없습니다.");
	    }else {
	    	System.out.println("gas를 주입하세요 ");
	    }
	}
}
