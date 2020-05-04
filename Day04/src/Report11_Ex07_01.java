
public class Report11_Ex07_01 {
	public static void main(String[] args) {

/* [과제] 문제 1)
 * 이중 for 반복문을 사용하여 다음과 같이 출력되게 하시오
 * 출력 예) *
 *       **
 *       ***
 *       ****
 *       *****
 */
	    int i;
	    int j;
	  for (i=1;i<=5;i++){
	    for (j=1;j<=i;j++){
	  System.out.print("* ");
	  }
	  System.out.println("");
	  }	
			
	  System.out.println("===================================================================");
			
 /* 문제2) 이중 for 반복문을 사용하여 다음과 같이 구구단을 출력하게하고,
 *        while 반복문을 사용하여 구구단제목을 출력되게 하시오
 * 출력예) 2단          3단           4단    5단    ........ 9단
 *       2*1=2  3*1=3
 *       2*2=4
 *       ...
 *       2*9=18  ...                    9*9=81
 * 가로로 출력할 것 
 */
	  for (i=1;i<=9;i++) {
		  for( j=2;j<=9;j++) {
			  
			  System.out.print(j+"*"+i+"="+(i*j)+"\t");
		  }
		  System.out.println();
	  }

	   System.out.println("===================================================================");
      int k=2;
      while (k<=9) {
    	  System.out.print(k+"단\t");
          k++;
      }
	System.out.println("\n--------------------------------------------------------------------");
       for(i=1;i<=9;i++) {
    	   for( j=2;j<=9;j++) {
 			  
 			  System.out.print(j+"*"+i+"="+(i*j)+"\t");
 		  }
 		  System.out.println();
 	  }
		
		
	
	
	
	
	
	
	
	}
}
