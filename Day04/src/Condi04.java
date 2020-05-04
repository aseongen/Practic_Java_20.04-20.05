import java.util.Scanner;

public class Condi04 {
  public static void main(String[] args) {
	
/* for 반복문_)
 * for ( 초기치, 조건식,증감식){
 * 조건식이 참일동안만 반복실행
 */
	  
	  int i ;
	  for (i =1 ; i<=5; i++) {
		  System.out.print(i + " ");
	  }
	  System.out.println("-----------------------------");
	  
	  for(i=3;i>=1;i--) {
		  System.out.println(i + " ");
	  }
	  System.out.println( "--------------------------------");
	  
	  for(i =2;i<=6;i=i+2) {
		  System.out.println(i + " ");
	  }
	  System.out.println("------------------");
	  
	  for(i=9;i>=1;i-=2) {
		  System.out.println(i + " ");
	  }
	  System.out.println("-----------------------");
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("구구단을 출력하기 위한 단 입력> ");
	  
	  int dan = sc.nextInt();
	  System.out.println("***"+dan+ "단 ***");
	  for(i=1;i<=9;i++) {
		System.out.println(dan + "x" +i + "=" + (dan*1));
	  }
	  
	  
	  
}
}
