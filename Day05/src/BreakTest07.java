import java.util.Random;
import java.util.Scanner;

public class BreakTest07 {
	public static void main(String[] args) {
/*Math.random() 메서드는 0.0 이상, 1.0 미만 사이의 실수 숫자 난수를 발생 
 *  -> *6 하면 0.0 이상, 6.0 미만
 *  -> int 형변환 하면 소수점을 버리고 
 *  -> +1 하면 : 1이상 7미만 사이의 임의 번호 발생
 * 		
 */
		
/* 문제)
 * while  무한 루프를 사용하여 주사위 번호 1~6 까지 무한 난수를 발생시켜 출력하고,
 * 주사위 번호 중 6이 발생 했을 때, 무한 루프문을 중단시키는 코드를 작성하자 
 */
		while(true) {
			int i= (int) ((Math.random()*6)+1);
			
			if(i==1) {
				System.out.println("1번이 나왔습니다.");
			}else if (i==2) {
				System.out.println("2번이 나왔습니다.");
			}else if (i==3) {
				System.out.println("3번이 나왔습니다.");
			}else if (i==4) {
				System.out.println("4번이 나왔습니다.");
			}else if (i==5) {
				System.out.println("5번이 나왔습니다.");
			}else if (i==6) {
				System.out.println("종료");
                break;
			}
			
		}
		
		
		
		while(true) {
			int i= (int) ((Math.random()*6)+1);
		     System.out.println("주사위 번호 " + i);
		     if(i==6) {
		    	 break;//반복문 중단
		     }
		}
		System.out.println("종료 ");
		
		
/*문제2) for 무한 루프 사용하여 주사위 번호 1부터 6까지 무한 난수를 발생시켜 출력하고, 
 * 주사위 번호중 4가 발생했을 때, for 반복문을 중단합니다.
 * 단, 랜덤 메스는 사용하지 마십시오. 
 */
	   
	    Random s = new Random();
		
	    for(;;) {
	       int num = s.nextInt(6) +1; //1부터 6사이의 임의의 정수숫자 발생 
		   System.out.println(num);
		
		if(num==4) {
           break; 
		}
		}
		
	}
}
