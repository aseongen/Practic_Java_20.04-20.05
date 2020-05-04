
public class ArrayMethod06 {

	public static void main(String[] args) {

		int score[][]= {
				        {100,100},
				        {90,90}
		               }; //2행*2열 -> 2차원 배열원소값 초기화
		int sum=0;// 배열원소 누적합
		//일반 이중 for 반복문으로 일괄적으로 배열원소값 출력
		
		for(int i=0;i<score.length;i++) { //score.length는 행의 길이
			for(int j=0;j<score[i].length;j++) { //score[i].length 는 각 행의 열의길이
				System.out.println("score["+i+"]["+j+"]:"+score[i][j]);
			}//inner for
		}//outer for
		
		System.out.println("\n-------------------------------------------");
		
		//향상된 확장 for
		for(int[] arr : score) { //2차원배열 -> 1차원 배열로 변경
			for(int k:arr) { //1차원 배열 -> 일반변수 
				System.out.println(k+" ");
				sum+=k;
			}
		}
		System.out.println("\n합계= "+ sum);
		
		
	}
}
