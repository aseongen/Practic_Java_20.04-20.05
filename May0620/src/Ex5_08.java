//**1차원으로 나올 가능성 있음 
public class Ex5_08 {
	public static void main(String[] args) {

		int[][] score = { { 95, 96 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0; // 배열원소 누적합
		double avg = 0.0; // 평균
		int cnt = 0; // 배열 원소값을 카운터

		/*
		 * 문제 ) 주어진 배열 2차원 배열원소 값의 총 합과 실수 평균값을 구해보는 코드를 완성해세요. (확장된 for, 향상된 for)
		 */

		for (int i = 0; i < score.length; i++) { // score.length는 행의 개수 => 3을 반환
			for (int j = 0; j < score[i].length; j++) { // score[i].length는 각행의 열의 개수
				sum += score[i][j];
				cnt++;
			}

		}
		avg = (double) sum / cnt;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);

	}
}
