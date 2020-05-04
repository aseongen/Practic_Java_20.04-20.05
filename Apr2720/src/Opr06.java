import java.util.Scanner;

public class Opr06 {

	public static void main(String[] args) {

	//복합대입연산자
	int result =0;

	result += 10; //0+10
	System.out.printf("result = %d \n", result);

	result -= 5 ; //10-5
	System.out.printf("result = %d \n", result);
		
	result *= 3 ; //5*3
	System.out.printf("result = %d \n", result);
	
	result /= 5; //15/5
	System.out.printf("result = %d \n", result);
	
	result %= 3;//3/3
	System.out.printf("result = %d \n", result);
	
	//삼항조건 연산자
	/*문제)
	 * java.util 패키지의 스캐너 클래스를 이용해서 0~100사이의 임의의 정수 정수값 85를 입력받는다
	 * 그런다음 3항 조건 연산자를 사용해서 점수가 90점 이상이면 A 학점, 80점 이상이면 B, 나머지 80점 미만이면 c
	 */
	Scanner sc = new Scanner(System.in);
	System.out.print("점수 정수값을 입력하시오 : ");
	int a = Integer.parseInt(sc.nextLine());
	
	if( a>=90) {
		System.out.println("A학점입니다.");
	}else if(a>=80){
		System.out.println("B학점입니다.");
	}else {
		System.out.println("C학점입니다. ");
	}
	
	String str = a>=90 ? "A학점입니다.": (a>=80 ? "B학점입니다.": "C학점입니다.") ;
	System.out.println(str);
	
	System.out.println("-----------------------------------");
	
	int score = sc.nextInt();
	char grade = ' '; //학점, 단일문자 초기화는 한칸 띄워서 ' ' 
    grade = (score >=90)? 'A' : ((score>=80)? 'B' : 'C');
	System.out.println(grade);
	
	sc.close();
	
	}
}
