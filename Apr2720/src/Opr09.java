import java.util.Scanner;

public class Opr09 {

	public static void main(String[] args) {

//if else  : 선택적 처리
		/*
		 * if(조건식){ 조건식이 참이면 실행 ; }
		 * 
		 * if(조건식){ 조건식이 참이면 실행; }else{ 조건식이 거짓이면 실행; }
		 */

		int num = -5;
		if (num < 0) {
			num = -num; // 양의 절대치
		}
		System.out.println("-5의  양의 절대값= " + num);

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수값 >> ");
		int num1 = sc.nextInt();

		if (num1 < 0) {
			System.out.println("양의 정수값만 입력하세요");
		} else {
			if (num1 % 2 == 1) {
				System.out.println(num1 + "는 홀수이다");
			} else {
				System.out.println(num1 + "는 짝수이다.");
			} // inner
		} // outer

	}

}
