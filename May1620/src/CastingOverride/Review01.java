package CastingOverride;

/* 업캐스팅)
 * 상속관계에서, 자손타입으로 올리는것 -> 자동형변환
 * 
 * 다운캐스팅)
 * 1)상속2)명시적인 형변환3)사전 업캐스팅
 */
class Teacher{
	void t01() {
		System.out.println("선생님, 조상 메서드");
	}
} //Teacher
class Students extends Teacher{
	void st01(){
		System.out.println("학생, 자손클래스");
	}
}//student

public class Review01 {
	public static void main(String[] args) {

		Students st = new Students();
		st.t01();//상속 받아서 호출
		st.st01(); //자손 클래스 호출
		
		System.out.println();
		
		// 업캐스팅
		Teacher th = new Students();
		th.t01();
		
		//다운캐스팅
		Students st02 = (Students)th;
		st02.st01();
		
	}
}
