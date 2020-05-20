package List;

import java.util.ArrayList;
import java.util.List;

public class List06 {
	public static void main(String[] args) {

    List<String> cityList = new ArrayList<String>();
    
  /* 제네릭(지네릭스)란?
   *  1.원래 컬렉션은 복수개의 타입을 동시 저장할 수 있다. 그러다보니 자료의 안정성도 떨어지고 원하는 자료값 추출도 어렵다.
   *    그리고 불필요한 업/다운 캐스팅 형변환을 해야한다. -> 해결하기 위해 java5 추가-> 제네릭 문법
   *  2. <String> 이라는 제네릭스 타입을 지정하면, 오로지 문자열 값만 저장가능하다. 
   */

    
//    cityList.add(10); -> 문자열 값만 저장 가능하다.
    
    cityList.add("seoul"); cityList.add("busan");//add()메서드로 원소값 추가 
    
  /* 문제) 일반 for 와  향상된 확장 for 를 사용하여 'seoul,busan;의 영문 대문자로 각각 출력하는 코드를 작성해라 
   */
    
    
 
    for (int i = 0; i<cityList.size(); i++) {
    	System.out.println(cityList.get(i).toUpperCase());
    }
    
    System.out.println();
    
    for (String k : cityList) {
    	System.out.println(k.toUpperCase());
    	
    }
    
    System.out.println();
    
    for(Object obj : cityList) {
    	System.out.println(obj.toString().toUpperCase());
    }
    
    
    
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
	
	} //main
}//class
