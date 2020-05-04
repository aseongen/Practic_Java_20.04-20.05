import java.util.Scanner;

public class OprData09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.print("나이입력>> ");
		int age = scan.nextInt(); // 정수 숫자로 입력
		String result = "";
		result = (10 <= age && age <= 19)? "10대" : " 10대 아님";
		
		System.out.printf("%d세는 %s \n" , age,result);
		
		System.out.println("---------------------------------------------------");
		
		char ch ='b';
		result = ('A'<=ch && ch <= 'Z')? " 영문 대문자" : "영문 소문자";
		System.out.println(ch+"는"+result);
		
		
	}

}
