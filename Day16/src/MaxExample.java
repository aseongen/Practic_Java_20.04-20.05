import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxExample {
	public static void main(String[] args) {

		/* 과제물)
		 * 1. 최고 점수를 받은 아이디와 최고 점수를 구하는 알고리즘 코드를 작성해 보세요
		 * 2. 점수 합계를 구하는 코드를 작성해보세요
		 * 3. double 점수 평균을 구해보세요
		 * 4. 점수 합계 
		 * 5. 출력문 : 평균점수, 최고점수, 최고점수 아이디 각각 출력
		 * entryget, total 
		 * 
		 * for 문 밖에서 평균
		 */
		
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96); //아이디와 점수를 키, 값쌍으로 저장
		map.put("hong", 86);
		map.put("white",92);
		
		String name = null; //최고점수를 받은 아이디를 저장
		int maxScore=0; //최고점수
		int totalScore =0; //점수 합계
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

		for(Map.Entry<String, Integer> entry: entrySet) {
			
		  if(maxScore<entry.getValue()) {
			 maxScore=entry.getValue();
			 name = entry.getKey();
		   }
			totalScore += entry.getValue();
		}//for
		
		 System.out.println("최고 점수 아이디: " + name);
		 System.out.println("최고 점수: " + maxScore);
		 System.out.println("점수 합계: " + totalScore);
		 
		 double avg ;
		 avg =(double)totalScore/map.size();
	 
		 System.out.println("평균 점수: " + avg);
		 
	}//main
}//class
