package Final;
/* final 변수)
 * : final로 선언된 변수는 영문대문자 작성
 * : 수정할 수 없는 변수. 즉, 상수가 된다.
 * : 생성과 동시에 초기화 진행해야한다.
 */

class Girl{
	final String NAME = "나나";
    final String PHONENUMBER ;
    int age;
    
    //오버로딩
    //생성자 오버로딩 되면 기본 생성자를 묵시적으로 제공하지 않는다.
    Girl(String PHONENUMBER, int age){
    	this.PHONENUMBER = PHONENUMBER;
    	this.age = age;
    }
    void p() {
    	System.out.println("이름: "+NAME);
    	System.out.println("핸드폰 번호: " + PHONENUMBER);
    	System.out.println("나이: " + age);
    }
}
public class Review09 {

	public static void main(String[] args) {
		
		Girl gi = new Girl("010-1111-1111",13);
		gi.p();
		
	} 
	
}
