class A2{
	
	public String toString () {
		return"4";
	}
}//class A2
class B2 extends A2{
// 각자 이클립스 메뉴로 toString ()메서드를 오버라이딩 하기 
	@Override
	public String toString() {
		return super.toString()+"3"; //43
	}
	/*만약 class A2의 public 생성자가 주석처리 되면 
	 * 컴파일 에러는 발생되지 않으나 B2 클래스의 override는 -> 오브제트 클래스 (묵시적 생략) 조상 클래스를 가져오게 된다 
	 * 
	 */
}//class B2
public class Ex16_7 {
	public static void main(String[] args) {
		
		System.out.println(new B2());//new B2 뒤에 toString 생략됨 
	}

}
