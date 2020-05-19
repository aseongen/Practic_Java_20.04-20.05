package Day14;
import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {

		String tel = "02-8888-9999";
		
		// ' - ' 구분자를 기준으로 폰 번호를 분리 => 분리된 폰 번호를 토큰 문자열이라고 한다. (회원정보 수정창)
	    // split() => 첫번째 방법
		String[] phoneArr = tel.split("-"); // - 를 기준으로 폰 번호를 분리해서 문자열 배열로 반환 
		for(String p : phoneArr) {
			System.out.println(p);
		} //for
		
/* 문제) java.util 패키지의 StringTokenizer 클래스를 활용하여 폰번호를 분리한다. 
 * 다음과 같이 출력되게 한다. 
 * 출력 예시) 010 
 *        8888
 *        9999
 */
		System.out.println("---------------------------------");
		
		StringTokenizer st = new StringTokenizer(tel, "-");
        int ct = st.countTokens(); //남은 갯수
		for(int i =0; i<ct ; i++) {
			String token = st.nextToken(); //nextToken: 한개씩 꺼내옴
			System.out.println(token);
		}//for
		
         while(st.hasMoreTokens()){ //분리된 번호가 있다면 참
        	 System.out.println(st.nextToken()); // 토큰 문자열을 가져와 출력 
         }//while
	}
}
