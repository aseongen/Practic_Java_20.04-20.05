import java.util.Scanner;

interface IHello03 {
	public abstract void sayHello(String name);
	// public abstract 를 생략할 수 있다.
}

interface IGoodBye {
	void bye(String name);
}

class Son03 implements IHello03, IGoodBye {
//인터페이스는 하나 이상의 조상으로부터 다중상속을 받을 수 있다. 
	@Override
	public void bye(String name) {
		System.out.println(name + "님 잘가");
	}

	@Override
	public void sayHello(String name) {
		System.out.println(name + "님 안녕");
	}
}

public class InterfaceTest03 {
	public static void main(String[] args) {

/* 1. 자손 클래스 s 객체를 생성하고 스캐너를 활용하여 첫번째 홍길도 이름을 입력받아 홍길동 안녕
 * 2. 스캐너를 활용하여 이순신을 입력받아,이순신님 잘가 
 */
        Son03 s = new Son03();
        
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 이름을 입력하시오>>");
		String a = sc.nextLine();
		
		System.out.print("두번째 이름을 입력하시오>>");
		String b = sc.nextLine();
		
		s.bye(b);
		s.sayHello(a);
		
	}
}
