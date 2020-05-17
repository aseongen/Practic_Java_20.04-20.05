package Interface;

interface Count01{
	void gugudan (int k);
}//count01

interface ArrPlay{
	void arrSum(int[]arr);
}//arrPlay

//인터페이스에서 인터페이스 상속은 extends
interface Total extends Count01, ArrPlay{
	void introduce(String name);
}//Total

//클래스 자손이 인터페이스 상속시 implements
class Subclass implements Total{

	@Override
	public void gugudan(int k) {
		//구구단
		System.out.println(k+"단");
		for (k=1; k<=9;k++) {
			System.out.println(7 + " * " + k + " = " + (k*9) );
		}
	}//gugudan

	@Override
	public void arrSum(int[] arr) {
		int sum =0;
		for(int a : arr) {
			sum+=a;
		}
		System.out.println("누적합: " + sum);
	}//arrSum

	@Override
	public void introduce(String name) {
		System.out.println(name+"님 반가워요");
	}//introduce
	
}//subclass


public class Review03 {
	public static void main(String[] args) {

		Subclass sb = new Subclass();
		sb.gugudan(7);
		
		System.out.println();
		int [] arr = {10,20,30,40};
		sb.arrSum(arr);
		
		System.out.println();
		sb.introduce("하하");
		
		
		
		
	}
}
