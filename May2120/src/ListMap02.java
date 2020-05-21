class TestClass{
	private Object member;

	public Object getMember() {
		return member;
	}

	public void setMember(Object member) {//업캐스팅
		this.member = member;
	}
	
}//TestClass

public class ListMap02 {
	public static void main(String[] args) {

		TestClass tc = new TestClass();
		tc.setMember(10); // 오토박싱과 업캐스팅
		
		System.out.println(tc.getMember());

		//업캐스팅
		tc.setMember("abc");
	
		Object obj = tc.getMember();
		if(obj instanceof String) {
			String st = (String)obj;
			System.out.println(st.toUpperCase());
		}//if

		/* 제네릭 타입을 지정하지 않아서 자바 최상위 클래스 타입으로 업캐스팅 형변환 되면서 저장되고 
		 * 다운 캐스팅 등 불필요한 연산 수행이 이뤄진다. 
		 * 이런 문제점은 결국 해당 프로그램 속도 저하 문제 발생 
		 *  => 제네릭 타입이 나온 이유 중 하나가 된다.
		 */
	}
}
