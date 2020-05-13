/*숙제)
 * 피피티 2번문제 foo.i 말고 보다 좋은 코드로 만들것
 * 조작되지 않게 void 로 이용해서 
 */
class SubClass22{
	int i =3;
	
	void method() {
		System.out.println("i= " + i);
	}
}
public class Ex17_3 {

	public static void main(String[] args) {
		
		Object o = new SubClass22(); //업캐스팅
		
		if(o instanceof SubClass22) { //다운캐스팅 가능 여부
		SubClass22 foo =(SubClass22)o; //다운캐스팅
	       foo.method();
		}
		
	}
	
}
