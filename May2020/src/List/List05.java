package List;

import java.util.Enumeration;
import java.util.Hashtable;

public class List05 {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		
/* java.util 의 Map 컬렉션 인터페이스를 구현상속한 컬렉션 클래스 Hashtable)
 * : java 1.0 에서 추가. 키,값 쌍으로 저장하는 사전적인 자료구조
 * : 중복키는 허용하지 않고, 중복값은 허용한다. 
 * : 키를 통해 값을 저장하기 때문에 검색속도가 빠르다.
 * : 저장되는 순서는 유지하지 않는다. 
 */
		
		ht.put("apple", "사과");
		ht.put("grape", "포도");
		ht.put("banana", "바나나");
		
		String val ="";
		Object objValue=ht.get("grape");
		
		if(objValue instanceof String) {
			val=(String )objValue; //명시적 다운캐스팅
		}//if
		
		if(val != null) {
			System.out.println("grape: " +val);
		}//if
		
		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) { //키가 있다면 참
			Object k = Enum.nextElement(); //키를 구함
			Object v= ht.get(k); //키에 대한 값을 구함
			System.out.println(k + " : " + v);
		}//while
		
	} //main
} //class
