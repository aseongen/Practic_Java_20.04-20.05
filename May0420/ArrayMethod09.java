
public class ArrayMethod09 {
	public static double getAvg(int[] score) {
		
		int sum=0;
		double avg =0;
		
		for(int k : score) {
			sum+=k;
		}
		
		System.out.println(sum);
		avg=((double)sum/score.length);
		return avg;
	}
	
	public static void main(String[] args) {

    int[] oldIntArray = {1,2,3};//배열 크기 3
    int[] newIntArray = new int[5];//배열 크기가 5
    
    for(int i=0; i<oldIntArray.length;i++) {
    	newIntArray[i]=oldIntArray[i]; //첫번째, 두번째, 세번째, 배열 원소 값만 복사됨 =>1 2 3 
    	//네번째. 다섯번째 초기값0
    }
    
    for(int a: newIntArray) {
    	System.out.println(a+" ");
    }
	
    System.out.println("\n----------------------------------");
    //배열 복사
	String[] oldStrArray = {"java","oracle","jsp"};
	String[] newStrArray = new String[5];
	
	System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
/* arraycopy (원본배열, 원본배열에서 복사할 항목의 시작 인덱스 주소번호, 새배열, 새배열에서 붙여넣기 할 시작 주소 인덱스 번호, 복사할 개수);
 * 결국, 첫번째, 두번째, 세번째 배열 원소값만 복사된다. 나머지는 기본값 null 이 저장됨.
 */

	//확장형 for
	for(String arr: newStrArray) {
		System.out.print(arr+" ");
	}
	
	int []scores= {95,71,84,93,87};
/* 문제)
 * 	정적 메서드 getAvg(int[] score){}  정의해서
 *  배열 원소 누적합을 구해서 실수평균값을 구한다음
 *  그 값을 반환해서 출력하는 코드를 완성하시오.
 */
	System.out.println(getAvg(scores));	
	
	double result = getAvg(scores);
	System.out.println(result);
	}
}
