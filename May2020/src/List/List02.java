package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List02 {
	public static void main(String[] args) {

/*  java.util패키지의 컬렉션 클래스 List 특징)
 * 1. 가변적크기의 복수개의 타입의 하나 이상의 원소값을 한꺼번에 저장할 수 있는 컬렉션 자료구조이다.
 * 2. 저장된 원소값의 순서를 유지한다.
 * 3. 중복 원소값을 허용한다.
 */
		//조상타입으로 업캐스팅
		//ArrayList 호출해서 값을 해당 list에 저장 
		
		List list = new ArrayList();
		
		/* 10 이라는 숫자 -> Integer 타입으로 변환 ->Object 클래스로 업캐스팅
		 * list.add() 나열한 순서대로 배열 번호가 부여 -> list에 저장이 됨.
		 * 따라서, for 반복문 실행시 배열 순서에 맞게 출력이 된다. => HashSet과 다른점 */
		
		list.add(10); list.add(10.3); list.add(10); list.add("이순신"); list.add(false); 
        System.out.println("컬랙션 크기: " + list.size());
		System.out.println(list);
		
	    System.out.println("------------------------");
        
		for(int i=0; i<list.size();i++) {
			//get() 메서드로 컬렉션 원소값을 가져옴
			System.out.print(list.get(i) + " \n");
		}//for
		
		System.out.println("--------------------------");
		
		//향상된 확장 for
		for(Object obj :list) {
			System.out.println(obj + " ");
		}//for
		
		System.out.println("--------------------------");
		
		Set set = new HashSet();
		set.add(10); set.add(10.2); set.add(10); set.add("이순신"); set.add(true);
		System.out.println(set);
		
	} //main 

}//class