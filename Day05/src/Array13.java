
public class Array13 {
	public static void main(String[] args) {

    int [] score = {100,90,80}; //배열 원소값을 직접 저장하면서 score 배열생성
    int sum =0;
    
    for(int i=0; i<score.length;i++) {
    	System.out.println("score[" + i + "] : " + score[i]);
    }
    
    for (int k : score) {
    	sum= sum +k; // 누적합
    }
    
    int avg =0;
    avg = sum/score.length;
   System.out.println("배열원소 누적합= " + sum);
   System.out.println(avg);
	
	
	
	
	
	
	
	
	}
}
