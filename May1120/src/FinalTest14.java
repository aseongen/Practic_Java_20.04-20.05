class People{

	public String name;//이름
	public String ssn;//주민번호
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}//생성자 오버로딩 
}
class Student extends People{ //class 자손 클래스 extends 조상클래스 => 클래스 상속은 단일 상속만 가능하다 . 
	public int studentNo; // 학번
	public Student(String name,String ssn, int studentNo) {
		super(name,ssn); // 조상클래스 오버로딩 된 생성사 호출
		this.studentNo= studentNo;
	}
	void p() {
		System.out.println("학생명 : " + name); //this 생략, 상속에서 조상거를 가지고올 경우 super
		System.out.println("학번 : " + studentNo);
	}
}

public class FinalTest14 {

	public static void main(String[] args) {
 
		Student student = new Student("홍길동","1235-12345",22);//오버로딩된 생성자 호출
		System.out.println("학생명: " + student.name);
    	System.out.println("학번: " + student.studentNo);
		System.out.println("------------------------------------");
   /*문제)
    *24~25 출력부분을 student 클래스의 소속 void p() 메서드로 출력하는 코드
    */
    	Student stu = new Student("하하", "1111-1111",23);
    	stu.p();
	}
}
