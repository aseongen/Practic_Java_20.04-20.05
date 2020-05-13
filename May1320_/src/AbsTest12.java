import net.daum.model.Animal;
import net.daum.model2.Cat;
import net.daum.model2.Dog;

public class AbsTest12 {
	public static void main(String[] args) {

		/*문제
		 * 1.net.daum.model 패키지에는 Animal 이라는 추상 클래스를 정의하고 
		 * 추상메서드 sound() 정의한다.
		 * 
		 * 2.net.daum.model 패키지에는 Animal 이라는 추상클래스를 상속받은 첫번쨰 자손클래스 Dog() 만들고
		 * 추상메서드를 오버라이딩 한다음 실행문장을 멍멍이 출력되는 코드를 완성한다.
		 * 
		 * 3. net.daum.model 패키지에 Animal 이라는 추상클래스를 상속받은 두번째 자손클래스 Cat를 만들고
		 * 추상메서드를 오버라이딩 해서 실행 문장으로 야옹이를 출력되는 코드를 작성합니다. 
		 * 
		 * 4. 메인메서드에서  배열크기가 2인 Animal 클래스 객체 배열 arr 을 생성하고 각 배열원소로 자손 클래스 객체를 저장한다음
		 * 일반 for반복문을 사용해서 각각의 문장을 출력해라
		 * 
		 */
	
		Animal [] arr = new Animal[2];
		
		arr[0] = new Dog();
		arr[1] = new Cat();
		
 		for(int i=0; i<=arr.length-1;i++) {
			arr[i].sound();
	
			//i<=arr.length-1 == i<arr.length
 		}//for 문 
	
/*문제)
 * Animal 타입 참조변수 a를 선언하고 각각의 자손을 업캐스팅한 한 다음
 * 다시 instanceof 연산자를 활용하여 다운 캐스팅을 하여 오버라이딩을 한 메서드를 호출해서 멍멍,야옹을 출력해라
 */
 		
 		System.out.println("---------------------------------");
 		
 		Animal c = new Dog(); //업캐스팅
 		
 		if (c instanceof Dog) { //다운캐스팅 
 			Dog a1 = (Dog)c;
            a1.sound();
 		}
 		
 		c= new Cat();
 		
 		if (c instanceof Cat) {
 			Cat b1= (Cat)c;
            b1.sound();
 		} //if 
 		
 		System.out.println("-------다형성----------");
 		ref(new Dog()); ref(new Cat());
 		
	}//main
	
	static void ref(Animal a) { //다형성 (상속, 업캐스팅 필수 )
		a.sound();
	}

}
