
public class Condi11 {
	public static void main(String[] args) {

    for(int i=1; i<=3;i++) {
    	for(int j=1;j<=3;j++) {
    		for(int k=1;k<=3;k++) {
    			System.out.println("" + i+j+k); //덧셈하지 않고 문자열로 연결해서 출력 
    		}
    	}
    }
	
/*22부터 76까지의 짝수의 개수와 그 합을 구하는 프로그램을 작성하시오
 * 짝수의 개수 -> 28
 * 그 합 -> 1372
 */

    int tot = 0;
    int cnt =0;
    for (int i =22; i<=76; i+=2) {
    		cnt++;
    		tot+=i;
        }
	System.out.println(tot);//합
	System.out.println(cnt);//개수
    
    
	}
}
