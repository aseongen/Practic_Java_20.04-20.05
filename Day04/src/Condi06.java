
public class Condi06 {
	public static void main(String[] args) {

/* while (조건식){
 * 조건식이 참일동안만 반복
 * 증감식;
 * }
 */
		
		int i ;
		for (i =1; i<=5; i++);{
		System.out.print(i + " \n");
		}
		System.out.println("--------------------------");
		
		i=1;
		while(i<=3) {
			System.out.print(i+"\t");
			i++;
		}
		System.out.println("---------------------------");
		
		i=3;
		while(i>=1) {
			System.out.println(i+ "\t");
			i--;
		}
		
/* 문제)
 * while 반복문 한개 안에 if else 조건문을 활용하여 1부터10까지
 * 자연수 중에서 홀수 누적합과 짝수 누적합을 각각 구해서 출력하는 코드를 작성해라
 */
		i=1;
		int tot=0; //짝수 합
		int count=0; //홀수합 
		
		while(i<=10) {
		    	i++;
             if (i % 2 == 0) {
            	tot+=i;
            	 System.out.println("짝수의 합:" +tot);
            	 break;
             } else {
            	 count+=i;
            	 System.out.println("홀수의 합:" + count);
            	 break;
             }  
		}//while
           System.out.println("---------------------------------");
              
              
          	while(i<=10) {
                if (i % 2 == 0) {
               	tot+=i;
                } else {
               	 count+=i;
                } 
                i++;
   		}//while
          	System.out.println(tot);
          	System.out.println(count);
              
              
		
		
	}
}
