package List;

import java.util.HashSet;
import java.util.Set;

public class List01 {
	public static void main(String[] args) {

		int[] scoreArr = { 10,20,30,40,50};
/* 배열 자료구조 특징)
 * 배열은 고정된 크기의 단 하나의 타입으로 복수개의 원소값을 한꺼번에 저장할 수 있다. 
 * 배열: 고정적 자료 
 
 * 컬렉션)
 * : 배열과 동일하게 여러개의 값을 저장할 수 있다.
 * 단, 여러 타입의 값을 저장하는 부분에서 배열과 다르다.
 * 가변적 자료 (java1.2)

 * 제네릭)
 * 컬렉션의 여러 타입을저장하는 특성을 보완하고자
 */

	System.out.println("scoreArr 배열원소 개수: " + scoreArr.length);
	
	for(int k:scoreArr) {
		System.out.print(k+"");
	}//for
	
	System.out.println(); //개행
	
	Set set = new HashSet();
	
/* java.utilPackage의 Set 컬렉션 인터페이스 특징)
 * 1. 가변적 크기의 복수개의 타입으로 하나 이상의 원소값을 한꺼번에 저장할 수 있다.
 * 2. 저장된 원소값 순서를 유지하지 않는다. 
 * 3. 저장된 원소값 중복을 허용하지 않는다. 
 */

	set.add(10); set.add(10.2); set.add(10); set.add("이순신"); set.add(true);
	
	//저장된 중복 원소값10은 하나로 인지
	System.out.println("set 컬랙션 크기: " + set.size()); 
	System.out.println(set);
	
	}//main
}//class
