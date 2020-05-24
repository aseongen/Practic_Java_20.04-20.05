
public class BreakTest03 {

	public static void main(String[] args) {

/*continue
 * 반복문 내에서 continue 문을 만나면 아래 문장을 실행하지 않고 다음 반복을 계속 한다.
 * 
 */

		for (int i=1; i<=10; i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+" "); //4,8 빼고 다 출력
		}
		System.out.println("\n------------------------------------------------");
		
/* 무한루프문이란 ?
 * 반복문 무조건 참이어서 영원히 반복하는 반복문을 말한다. 
 * 무한루프문 종류)
 *  - while (true) { }
 *  - for(;;){ } 
 */
        
		int n = 1;
		while (true) {
			System.out.print(n+ " end\t");
		    if(++n >= 10) {
		    	break; //반복문 중단, 무한루프문 종료 
		    }
		}//while
		System.out.println("\n------------------------------------------------");

		n=1;
		for(;;) {
			System.out.print(n+" end\t");
		    if(++n==10) {
		    	break; //무한 루프문 종료 
		    } //if
		}//for
		
		
		
	}

}
