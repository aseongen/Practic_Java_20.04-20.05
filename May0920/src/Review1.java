import java.util.Arrays;

public class Review1 {
	public static void main(String[] args) {

		int[] iArr= {100,90,55,45};
		for(int i=0; i<iArr.length;i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
		System.out.println("-------------------------------");
// 배열 점수에 대한 합계와 평균 
		int sum =0;
		float avg=0;
		
		int[] score = {100,88,100,100,90};
		
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		avg=sum/score.length;
		System.out.println("평균"+ avg);
		System.out.println("총합"+sum);
		
		System.out.println("----------------------------------");
//최대값, 최소값
		int[] scores = {79,88,91,33,100,55,95};
		int max=scores[0];
		int min=scores[0];
		
		for(int j=0; j<scores.length;j++) {
			if(scores[j]>max) {
			   max=scores[j];
			}else if(scores[j]<min){
				min=scores[j];
			}
		}//end of for
		System.out.println("최대값"+max);
		System.out.println("최소값"+min);
		
		
		
	}
}
