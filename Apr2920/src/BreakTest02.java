
public class BreakTest02 {

	public static void main(String[] args) {

/* 이중 for break 
 *  이중 for 반복문에서 break 문을 만나면 가장 근접한 맨 안쪽 반복문만 중단이 된다. 
 * 바깥 반복문은 중단이 안되기 때문에 -> 임의의 레이블 명을 명시한다.
 * break 라벨이름;
 */
		
    int a,i;
    for (a=1; a<=5; a++) {
    	for(i=1;i<=5;i++) {
    		if(i%3==0) {
    			break; // 맨 안쪽 가장 근접한 반복문만 중단. 외부 반복문 계속 반복중....
    		}//if
    		System.out.println("i -> " + i );
    	} //inner for 
    	System.out.println("\n a-> " + a );
    }//outer for 
    System.out.println("------------------------------------------");
		
		exit_for:// 라벨명
		for(a=1;a<=3;a++) {
			for(i=1;i<=3;i++) {
				if(i%2==0) {
					break exit_for; //이중for 중단
				}//if
				System.out.println("i: " + i);
			}//inner for
			System.out.println("\n a-> " + a);
		}//outer for 
		
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
