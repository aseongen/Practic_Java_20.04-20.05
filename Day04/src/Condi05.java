import java.util.Scanner;

public class Condi05 {

	public static void main(String[] args) {

		int i ; // for 반복문 제어변수 
		int total = 0; //누적합
		
		for (i=1; i<=5; i++) {
			total = total + i;
		}
		System.out.println("누적합: " + total);
		
		System.out.println("----------------------------------");
		
/* 문제 )
 * 문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복을 출력하시오
 */
       Scanner sc = new Scanner(System.in);
       System.out.print("문자를 입력하시오>>> ");
       String str = sc.nextLine();
       System.out.print("숫자를 입력하시오>>> ");
	   int cnt = sc.nextInt();
	   
       for (i= 1; i <=cnt; i++ )	{
    	   System.out.println(str);
       }
	   
 /*문제)
  * 반복문 한개만 사용해서 다음과 같이 출력되게 코드를 작성하자.
  * 출력예 ) 1 5 
  *       2 4 
  *       3 3
  *       4 2
  *       5 1
  */
      
       int k;
       for (i=1,k=5; i<=5 ; i++, k-- ) {
    	   System.out.println(i + "," + k);
       }
       
       for(i=1;i<=5;i++) {
    	   System.out.println(i+ " " + (6-i));
       }
	   
       sc.close();
	
	}

}
