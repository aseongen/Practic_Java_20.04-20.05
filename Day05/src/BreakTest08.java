
public class BreakTest08 {
	public static void main(String[] args) {

    outer: for(char upper ='A'; upper <='Z' ; upper++) {
    	for (char lower ='a'; lower<='z';lower++) {
    		System.out.println(upper + " ->" + lower);
    		if(lower == 'g') {
    			break outer ; //이중 for 중단
    		}
    	}
    	
    }//outer for 
    System.out.println("\n프로그램 종료 ");
	System.out.println("\n---------------------------------------------------------");
	
/* 문제1)
 * for 문과 continue 문을 활용하여 1~10  짝수만 출력하는 코드를 완성
 */
    for(int i=2; i<=10 ; i+=2) {
    	System.out.print(i + "\t");
    } 
    
    System.out.println("\n-------------------------------------------------------");
    
    for (int i=1; i<=10; i++) {
    	if (i%2==0) {
    		continue; //홀수일때 실행 안함 
    	}
    	System.out.print(i + " ");
    } //for
   
	
 /* 문제2)
  * for 반복문을 이용해서 1부터 100까지 자연수 중에서 4의 배수의 합을 구하는 코드 작성
  */
	
    System.out.println("\n-----------------------------------------------------------");
    int i;
    int tot = 0;
    
    for( i=1; i<=100; i++) {
    	if(i % 4 ==0) {
    		tot +=i;
    		System.out.print(tot + " ");
    	}
    	
    }//for
    System.out.println("\n-----------------------------------------------------------");
    System.out.print("4의 배수 누적합 : " + tot);
	
	
	}
}
