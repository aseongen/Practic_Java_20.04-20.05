import java.util.Vector;

public class ListMap04 {
	public static void main(String[] args) {

		Vector<String>list = new Vector<>();
		list.add("apple") ; list.add("orange");
		
//		Vector<Object>objlist;
//		objlist = list; 제네릭 타입으로 선언된 객체 타입간의 형변환은 안됨
		
/* <? extends Object> 은 제네릭 와일드카드 문법으로 Object 타입을 상속받은 자손은 형변환을 허용
 */
		Vector< ? extends Object> objlist;
	
		objlist = list;
		
		for(Object obj: objlist) {
			String fruit = (String) obj;
			System.out.println(fruit.toUpperCase());
		}//for 
	}//main
}//class
