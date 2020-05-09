class StaticBlock{
	static int[] arr = new int [10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
/* 0.0 이상 1.0 미만 사이 실수 숫자 난수 발생 ->*10하면 0.0이상~10.0미만
 * ->int 로 캐스팅(형변환)하면 소수점이하는 버림
 * 0이상10미만 ->+1 하면 1이상 ~11미만 -> 즉, 1~10 사이 임의 정수 숫자 난수가 발생 
 */
		} //for 
	} //static
}


public class ConsTest15 {
/*문제2)
 * 배열원소 누적합을 구하는  add () 작성하고 합을 반환받아 출력하세요.
 */
	static int add(int[] score) {
		int sum=0;
		for(int i=0;i<score.length;i++) {
		 sum+=score[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {

/*문제1)
 * for 반복문 사용해서 arr 배열 원소값의 누적합과 실수 평균값을 구해서 출력하시오.
 */
        int [] arr = StaticBlock.arr;
		int sum =0; //누적합
		double avg=0.0; //평균
		int count =0;
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(i+" ");
			sum+=arr[i];
			count++;
		}
		System.out.println("\n누적합:" + sum);
		avg=(double)sum/count;
		
		System.out.println("총평균:"+avg);
		
        
		System.out.println("---------------------------");
		 for(int k : arr) {
			 System.out.print(k+ " ");
			 sum+=k;
			 count++;
		 }
		 System.out.println("\n"+"향상된 합계:"+sum);
		 avg=(double)sum/count;
		 System.out.println("향상된 평균:"+avg);
		 System.out.println("--------------------------");
		 
		 
		 int[]score = {100,90,90};
		 int total = add(score);
		 System.out.println("문제 2번 정답: "+ total);
		 
		 int total2 = add(new int [] {90,100,90});
		 System.out.println(total2);
		 System.out.println("--------------------------");

/* 문제3)
 * 1~10사이 자연수 중에서 3의 배수 총합을 구하는 프로그램을 작성하세요
 */
		 int sum2 =0;
		 for(int i=1; i<=10;i++) {
			 if(i%3==0) {
				sum2+=i; 
			 }
		 }
		 System.out.println("3의 배수 총합: "+sum2);
	}
	

	
}
