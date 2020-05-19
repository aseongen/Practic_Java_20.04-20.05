interface Action02{
	void work(); //추상메서드 정의
}//Action02

public class ObjectTest02 {
	public static void main(String[] args) {

		Action02 action = new Action02() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
			
		};//익명클래스(내부무명클래스) => 외부 클래스명 $번호.class
		action.work();
	}//main
}//class
