import java.util.ArrayList;
import java.util.ListIterator;

public class ListMap08 {
	public static void main(String[] args) {

		ArrayList <Integer>list = new ArrayList<>();
		list.add(1); list.add(3); list.add(2); list.add(5);
		
		ListIterator<Integer> it = list.listIterator();
/* Iterator 인터페이스를 구현 상속한 자손 인터페이스 ListIterator 특징)
 * : 자바 2버전에서 추가 
 * : 양방향으로 접근 가능함. 단, List 컬렉션 인터페이스를 구현 상속한 자손 클래스에서만 사용가능하다.
 * 
 * Iterator 인터페이스는 단방향 즉, 다음원소값으로만 접근 가능하다. 
 */
		

		while(it.hasNext()) {
			//hasNext :  다음원소값이 존재하면 참 => 순방향으로 진행하면서 읽어옴.
			//next() 메서드로 다음 원소값을 가져옴.
			System.out.print(it.next()+" "); 
		}//while
		System.out.println(); //개행
		
		while(it.hasPrevious()) {
			//역방향으로 이전 값이 존재하면 참 
			System.out.print(it.previous()+" ");
		}//while
		
	}
}
