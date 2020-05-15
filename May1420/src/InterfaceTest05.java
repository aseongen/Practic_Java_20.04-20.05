interface Ihello05 {
	void gugudan(int k);	
}//Ihello5

interface IGoodBye02{
	void arrSum(int[] arr);
}//IGoodBye02

interface ITotal extends Ihello05,IGoodBye02{
	//인터페이스에서 인터페이스간의 상속은 extends 예약어를 사용한다.
	void greeting (String name); //public abstract 가 생략됨
}//ITotal

class SubClass05 implements ITotal{

	@Override
	public void gugudan(int k) {
		//구구단
		System.out.println(k+"단");
		for (k=1; k<=9;k++) {
			System.out.println(9 + " * " + k + " = " + (k*9) );
		}
	}//gugudan
	@Override
	public void arrSum(int[] arr) {
		//누적합
		int sum =0;
		for(int a:arr) {
			sum+=a;
		}
		System.out.println("누적합: " + sum);
	}//arrSum

	@Override
	public void greeting(String name) {
		System.out.println(name + "님 반가워요");
	}//greeting
}

public class InterfaceTest05 {
	public static void main(String[] args) {

/*  각각의 추상메서드를 오버라이딩 해서 구구단 중에 9단, 100+200+300+의 배열 원소 누적합, 홍길동님 반가워요 라는 값을 출력하세요
 */

	SubClass05 sc = new SubClass05();
	sc.greeting("홍길동");
	
	System.out.println();
	int[] arr = {200,300,400};
	sc.arrSum(arr); //arr 배열은 참조타입이기 때문에 번지 주소값이 전달된다. 
	
	System.out.println();
	sc.arrSum(new int[] {100,200,300});
	
	System.out.println();
    sc.gugudan(9);
	
	}
}
