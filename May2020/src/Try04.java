class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}

public class Try04 {
	static void changeDog(Animal animal) { //업캐스팅
		 
/* 문제)
 * 어떤 연산자 키워드와 if else if 다중 조건문을 사용하여 이 오류를 안나게 처리하시오 .
 * classCastException 런타임실행예외오류 가 안나게 형변환 에러 
 */
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;//명시적인 다운캐스팅
			}else if(animal instanceof Cat) {
				Cat cat=(Cat)animal;
			}// if ~ else if 
	}//ChangeDog
	
	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);
				
		changeDog(new Cat());//고양이가 아닌 개가 다운캐스팅됨.
		
	}//main
} //class
