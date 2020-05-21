import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListMap06 {
	public static void main(String[] args) {

    TreeSet<String> test = new TreeSet<>();
 /*  Set 컬렉션 인터페이스를 구현한 TreeSet 컬렉션 클래스)
  *  : java 2 에서 추가되었고, 영어: 알파벳, 한글: 가나다, 숫자: 오름차순 => 정렬
  */
	
    test.add("milk"); test.add("bread"); test.add("orange");
	System.out.println(test);
	
     TreeSet<Integer> test2 = new TreeSet<>();
     test2.add(10); test2.add(5); test2.add(13);
     System.out.println(test2);
     
     TreeSet<String> test3 = new TreeSet<>();
     test3.add("서울"); test3.add("부산"); test3.add("하남");
     System.out.println(test3);
     
     LinkedHashSet<String> hlist = new LinkedHashSet<>();
 /* Set 인터페이스를 구현한 컬렉션 클래스 LinkedHashSet)
  * : JAVA 4  Version 추가됨, HashSet의 문제점인 저장된 순서의 불명확성 제거함.
  * 저장된 순서와 같게 출력됨.
  */
     
     hlist.add("milk"); hlist.add("bread"); hlist.add("ham");
     System.out.println(hlist);
     
     //값을 누적해서 출력함. 
     hlist.add("우유"); hlist.add("아이스크림"); hlist.add("케이크");
     System.out.println(hlist);
    
	} //main
} //class
