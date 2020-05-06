//사용자 정의 메서드
class Animal02{
	String name;
	private int age; //private 접근권한 제어자로 선언된 age 멤버변수는 Animal02 클래스 밖에서 접근 못함.
	
	public void setAge(int new_age) {//setAge: 값 저장 age 메서드 
		age=new_age;
		
	}
	public int getAge() { //getAge : 값 반환  메서드 
		return age; //멤버변수값을 return 으로 getAge() 메서드 호출한 곳으로 반환 
	}
	//public 외부 클래스에서도 접근 가능// 일반메소드 : 내부 패키지에서만 호출 가능  
	
}
public class ObjectTest02 {

	public static void main(String[] args) {

     Animal02 a = new Animal02(); //new 객체주소가 저장된 참조변수 a 생성 => 객체명
     a.name = "홍길동"; a.setAge(26); //setAge 에 저장.
     System.out.println("이름: " + a.name + ", 나이: " + a.getAge()); //getAge: 리턴한 값 호출 
	}
}
