
public class BreakTest04 {

	public static void main(String[] args) {

		int sum=0, i=0;
		while(true) {
			if(sum>100) {
				break;//반복문 중단
			}
			++i; //선행 증가 
			sum +=i;//누적합
            
		}//무한루프문
		System.out.println("i= " +i + ", sum " + sum );
		
		System.out.println("--------------------------------------------------");
/*문제)
 * for continue 사용해서 1~10 사이의 중에서 3 6 9  만빼고 출력하는 코드를 작성하자 
 */
		
		for(i=0; i<=10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + "\t");
		}
		
		
		
		
	}

}
