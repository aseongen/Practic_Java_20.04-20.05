
public class Array14 {
	public static void main(String[] args) {
		
		int [] score = {75, 88,91,33,100,55,95};
		
		int max = score[0]; //배열 원소 최대값
		int min = score[0]; //배열 최소값
		
/* 문제 )배열 원소값에서 최대 ,최소 값을 구하는 알고리즘 코드를 완성하시오
 * 
 */
		
		for(int i = 1; i < score.length; i++) {
			if( max < score[i]) {
				max = score[i];
				
			} else if (min > score [i]){
				min = score[i];
			}
			
		}
		System.out.println("최대값 " + max);
		System.out.println("최소값 " + min);
		
		
	}
}
