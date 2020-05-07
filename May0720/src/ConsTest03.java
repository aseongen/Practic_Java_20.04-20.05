//메서드 활용 : 매개변수를 배열로

class Computer{
	int sum1(int[] arr) {
		int sum=0; //누적합
		for(int k: arr) {
			sum+=k;
		}
		return sum;
	} //sum1()
	
	/* int ... arr가변인자 문법은 자바 5버전에서 추가된 것으로 매개변수 개수가 다른 메서드가 오버로딩 된 경우 사용한다
	 * 인자값을 배열로 받아서 처리한다.
	 */
	
	int sum2(int...arr) {

    //지역변수 반드시 초기화를 하고 사용해야한다
	int sum=0;
	for(int i=0; i<arr.length;i++) {
		sum = sum + arr[i];
	}
	    return sum;
	}//sum2()
}//class Computer

public class ConsTest03 {
	public static void main(String[] args) {

		Computer com = new Computer();
		int[] score = {1,2,3};
		
		int result = com.sum1(score); //누적합
		System.out.println("score 배열원소 누적합: " + result);
	    System.out.println("배열원소 누적합 = " + com.sum1(new int [] {10,20,30}));

	    System.out.println("----------------------------------------------");
	    
	    result = com.sum2(10,20); //가변인자로 정의된 함수 호출
	    System.out.println("10+20: " + result);
	    System.out.println("1+2+3: " + com.sum2(1,2,3));
	}
	
}
