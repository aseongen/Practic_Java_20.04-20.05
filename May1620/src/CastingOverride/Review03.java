package CastingOverride;

class Teacher03{
	int a = 300;
	
	void t02() {
		System.out.println("선생님, 조상 메서드");
	}
} //Teacher

class Students03 extends Teacher03{
	int a = 600;
	int b = 700;
	
	void st02(){
		System.out.println("학생, 자손클래스");
	}

	@Override
	void t02() {
		super.t02(); //생략가능
        System.out.println("오버라이딩 된 메서드");
        System.out.println("this.a: " + this.a);
        System.out.println("super.a: " + super.a);
	}
}//student
public class Review03 {
	public static void main(String[] args) {

		//업캐스팅
		Teacher03 th3 = new Students03();
		th3.t02();
		
		System.out.println();
		
		//다운캐스팅 
		if(th3 instanceof Students03) {
			Students03 st03 = (Students03)th3;
			System.out.println("st03.a: "+st03.a);
		    System.out.println("--------------");
			st03.t02();
		}//if ~
		
	}
}
