class Parent12 {
	
}
class Child12 extends Parent12{
	
}

public class CastTest12 {
	static void method01(Parent12 p) { //parent12 parent = new parent12
		
		if(p instanceof Child12) { //다운캐스팅 
			Child12 ch =(Child12)p;
			System.out.println("다운캐스팅 성공 ");
			
		} else {
			System.out.println("다운 캐스팅 실패 ");
		}//method01 
		
/*문제)
 * intstanceof 연산자를 사용해서 true 이면 다운캐스팅해형변환 성공이라는 문자열 출력하고
 * false 이면 다운캐스팅 변환 실패라는 메시지 출력
 */
		
	}//매개변수타입 업캐스팅 함
	public static void main(String[] args) {

		Parent12 parentA = new Child12(); //업캐스팅
		method01(parentA);
		
		System.out.println();
		
// 다운캐스팅 실패가 출력되게 Parent B를 생성해서 인자값으로 전달하자
// 한줄, 두줄로 출력하시오
		Parent12 ParentB = new Parent12();
		method01(ParentB);

		method01(new Parent12());

 
	}
}
