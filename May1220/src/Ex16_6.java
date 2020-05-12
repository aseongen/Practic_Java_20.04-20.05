class Base{
	Base(){
		super(); //자바 컴파일러가 기본 제공함. => objet  최고 조상 클래스의 기본 생성자 호출
		System.out.print("Base  ");
	}
}//Base class
class Alpha extends Base{}
// 기본 생성자 생략됨 

public class Ex16_6 {
   public static void main(String[] args) {
	   new Alpha(); //자손클래스 기본 생성자 호출 
       new Base(); //
}
	
}

/* 7번문제 1번 4번 
*/


