//https://hunit.tistory.com/154?category=523912
class Person{
	final String NARA = "Korea"; //final로 선언된 변수는 영문대문자로 작성, 수정할 수 없는 변수.=>상수가됨
	                             // 생성과 동시에 초기화 진행해야한다.
	final String  JUMIN;
	String name;
	
	 //오버로딩
	Person(String JUMIN ,String name){
		this. JUMIN= JUMIN; this.name=name;
	} //생성자 오버로딩 되면 기본 생성자를 묵시적으로 제공하지 않는다. 
	   void print() {
	    	 System.out.println("국가명: "+ NARA);
	    	 System.out.println("주민번호: "+ JUMIN);
	    	 System.out.println("이름: "+ this.name); //this는 생략 가능 
	     }
}
class Earth{
	static final double RADIUS = 6400;//static final 정적 상수를 이야기한다. 
}
  
public class FinalTest01 {

	public static void main(String[] args) {

		Person p = new Person("1234-567","이순신");
		p.print();
		
//		p.NARA = "미국" ;; 상수 수정 불가 
		
		System.out.println((int)Earth.RADIUS); // 기본타입: double 타입으로 출력
		
	}

}


/* cmd 창에서 
 * 파일은 에디트 플러스로 생성함. 에디트 플: package com.naver.model;
 * c:\temp2
 * dir\w ->  디렉토리 파일 확인 명령어
*  javac -d . Test.java ->현재 디렉토리 경로에 Test 파일을 만들어라.
*  패키지 경로에 입력한 경로에 폴더가 생성됨. 
*  java.com.naver.model.Test : 패키지 폴더 컴파일 됨.
*/


