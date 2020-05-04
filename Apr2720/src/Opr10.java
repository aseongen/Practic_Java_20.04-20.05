import java.util.Scanner;

public class Opr10 {
	
	public static void main(String[] args) {

/* 문제)
 * 스캐너를 이용해서 정수 숫자를 입력받는다.
 * 입력받은 값이 0인지 아닌지 판별  (if ~esle 사용)
 */
		 Scanner sc = new Scanner(System.in);
			System.out.print("입력한값 >> ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("입력하신 값은 0입니다.");
			} else {
				System.out.println("입력하신 값은 0이 아닙니다.");
			}
			
			System.out.println("-------------------------------------");
			
			String temp=sc.nextLine();
			int number = Integer.parseInt(temp);
			if(number ==0) {
				System.out.println(number + "는 0입니다.");
			}else {
				System.out.println(number+ "는 0이 아닙니다.");
			}
			
			System.out.println("---------------------------------");

//최대 최소 알고리즘 코드		
            System.out.println("첫번쨰 정수 입력 >>");
			int a = Integer.parseInt(sc.nextLine()); // parseInt : 문자 -> 숫자
			 System.out.println("두번쨰 정수 입력 >>");
     		int b = Integer.parseInt(sc.nextLine());
					
			int max =0; //최대값
			int min =0; //최소값

			if (a >b) {
				max =a; min=a;
			}else {
				max=b; min=a;
			}//if else
			System.out.println("최대값 : " + max + "최소값 : " + min);

			
			
	}
}