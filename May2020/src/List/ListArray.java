package List;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
	
	public int getSum(List<Integer>list) {
		
		int sum =0;
		for (int k : list) {
			sum+=k;
		}
		return sum;
		
	}
	public static void main(String[] args) {
	    
		  /* 과제물 )
		   * 1.net.abc.test 패키지를 만들고, 클래스 파일 ListArray를 생성하자.
		   *   main()에서 int[] arr 배열 원소갑으로 100,90,100,80,90을 저장하고, 이것을 컬렉션 List<Integer> 타입으로 변경한다. 
		   *   
		   * 2. ListArray 클래스에서 public int getSum( List<Integer> list){} 메서드를 정의한 다음
		   *    원소 누적합을 구해서 반환하고, 메인 메서드에서 평균을 구한 다음 메인 메서드에서 double 평균을 구한다음 출력하는 코드를 각 그룹스터디별 기준으로 작성해 보자 
		   *    동시에 누적합도 출력한다. 
		   *    
		   * 3. "이것이 자바다" 컬렉션 부분 읽어오기 13장~15장
		   */
		
		List<Integer> cityList = new ArrayList<Integer>();
		int[] arr = {100,90,100,80,90};

		for(int i : arr) {
			cityList.add(i); ///값만 저장함.
			
		}//for
		
		ListArray la = new ListArray();
		System.out.println(la.getSum(cityList));
		
		double avg = 0;
		avg = (double)la.getSum(cityList)/cityList.size();
		//size(크기를 가져옴)
		System.out.println(avg);
		
	}//main
	
} //class
