
public class Array12 {

	public static void main(String[] args) {
		
/* 배열이란?
 * 배열은 고정된 크기로서 동일한 단 하나의 타입의 복수개의 원소값을 한꺼번에 저장할 수 있는 자료 구조이다.
 * 배열 생성법 
 *  : 타입[] 배열명 = new 타입[배열 크기];
 * 배열명.length 속성을 사용해서 배열 크기 , 배열 원소 개수를 반환한다.
 * 배열 주소 인덱스 번호는 0부터 시작한다.
 */

		int [] score = new int [3]; //배열 크기가 3인 score 배열 생성
		
		score [0] =100; // 첫번째 배열 원소값 저장 
		score [1] =100;
		score [2] =90;
		
		System.out.println("배열 크기 (원소개수): " + score.length); //배열원소값 출력
		for (int i =0 ; i<score.length; i++) {
			//i 초기값이 0부터 시작한 이유는 배열 주소 인덱스 번호가 0부터 시작한다.
			System.out.println(score [i] + " ");
		}
		System.out.println("\n-----------------------------------------------");
		
		//자바 1.5 에서 추가된 향상된 확장 for 반복문으로 배열원소값을 출력
		for(int k : score) {
			System.out.println(k+ " ");

		}

/* 향상된 확장 for 반복문 형식)
 * for (타입 변수명 : 배열명 ) {
 * 배열원소 개수만큼 반복하면서  원소값을 가져와 변수에 저장해서 읽어온다.
 * }
 */
		
		
		
		

		
		
		
		
	}
	
}
