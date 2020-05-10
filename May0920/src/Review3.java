
public class Review3 {
	 public static void getSum (int [] score) {
		 
		 int sum=0;
		 for (int i=0; i<score.length;i++) {
			 sum+=score[i];
		 }
		 
		 /* for (int a: arr) {
		  * sum+=a;
		  * }
		  * System.out.println(sum);
		  * avg = (double)sum/arr.length;
		  * System.out.println(avg)
		  */
		 
		  double avg =0;
		  avg = (double)sum/score.length;
		  System.out.println(sum); 
		  System.out.println(avg);
	 }
	
	public static void main(String[] args) {
 
    int [] score = {100,90,80};
    
    /*문제
     * 정적 메서드 static void getsum (int [] arr){} 을 선언하고 
     * 해당 메서드를 선언했을때, int 타입 총점과  double 타입평균을 구해서 출력하시오.
     */
    
    getSum(score);	
	
	}
}
