package List;

import java.util.LinkedList;
import java.util.Stack;

public class List04 {
	public static void main(String[] args) {

		Stack st = new Stack();
/* java.util 패키지의 컬렉션 클래스 stack)
 * 1. java.1.0 에서 추가되었고, 입구와 출구가 같다. 
 *    그러므로 가장 먼저 입력된 자료가 가장 나중에 출력된다. (FILO)
 *   
 * 2. 가장 나중에 입력된 것이 가장 먼저 나간다. (LIFO)
 */
		
		//push()메서드로 스택 맨 위에 원소값을 추가
		st.push("1-java"); st.push("2-oracle"); st.push("3-jsp/서플릿"); st.push("4-jsp/스프링"); 
	
		//스택에 값이 있다면 pop() 메서드로 스택의 맨 위의 원소값을 제거하면서 값을 반환
		while(!st.isEmpty()) { 
			System.out.println(st.pop());
		
		} //while
		
		System.out.println("----------------------------------");
	
/* LinkedList 컬렉션 클래스 특징)
 * : 입구와 출구가 다르다. 그러므로,가장 먼저 입력된 것이 가장 먼저 나가는 구조이다.(FIFO)
 */

		LinkedList myQue = new LinkedList();
		
		myQue.offer("1-java");// 해당 컬렉션 요소값 추가
		myQue.offer("2-oracle"); myQue.offer("3=JSP");
		
		//peek()는 해당 컬렉션이 비어있다면 null이다.
		//비어있지 않다면 컬렉션 원소값을 꺼내옴.
		while(myQue.peek() != null) {
			System.out.println(myQue.poll());
		}//while
		
		
	}//main
}//class
