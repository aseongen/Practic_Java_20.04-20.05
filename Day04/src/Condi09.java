import java.util.Scanner;

public class Condi09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하시오");
		int num = sc.nextInt();
		
		int i ;
		for(i=1; i<=num; i++) {
          if ( num % 2==1) {
        	  System.out.println(i);
          }else {
        	  System.out.println("짝수입니다.");
          }//if~else
		}  //for   

		System.out.println("---------------------------------");
		
		for(i=1; i<=num; i+=2) {
        System.out.println(i + " ");		
		}
	
/*문제
 * 10부터 1사이의 짝수를 10 8 6 4 2 로 출력 
 * 주의할 것은 마지막 2를 출력하시고 , 를 출력 안되게 하세요.
 */
		int j =10;
		while(j>=2) {
			j-=2;
			if (j%2==0) {
				System.out.print(j);
				System.out.println(",");
			}else {
				System.out.println();
			}//if else 
		}//while

		System.out.println("-------------------------------------------");
		
		i=10;
		while(i>=4) {
			System.out.println(i+",");
			i-=2; //2감소
		}
		System.out.println(i);
		
/*문제
 * A부터  Z까지 알파벳 출력하는 프로그램 작성
 * 
 */
		
	int alpa  ;
	for( alpa=65; alpa<=90; alpa++ ) {
		System.out.print((char)(alpa));
	}

	}
}
