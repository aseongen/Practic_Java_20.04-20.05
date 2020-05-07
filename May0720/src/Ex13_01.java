class Animal{
	String name;
	int age;
	
	Animal() {}
	
	//매개변수 2개인 생성자 오버로딩
	Animal(String name, int age){
		this.name = name; this.age = age;
	}
	
	public void show() {
		System.out.println(this.name + "는 " + this.age + "살입니다.");
	} //this 생략 가능 
}
public class Ex13_01 {
   public static void main(String[] args) {
	
	   Animal a1 = new Animal ("원숭이",26);
	   a1.show();
   }
}
