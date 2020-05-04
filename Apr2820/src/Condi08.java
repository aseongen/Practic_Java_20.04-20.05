import java.util.Scanner;

public class Condi08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String input ;
		System.out.println("메시지 입력하세요.");
		System.out.println("프로그램을 종료하시려면 Q 를 입력하세요.");
		
		do {
		 System.out.print(">>> ");
		 input = sc.nextLine(); //문자열로 읽어들임
		 System.out.println(input);
		} while(! ((input.equals("q") || input.equals("quit")))); {
		  System.out.println(); //줄바꿈 개행
		  System.out.println("프로그램 종료 ");// 입력값이 q일때 반복문 종료
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
