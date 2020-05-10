/*생성자
 * 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
 * 인스턴스 생성시 수행할 작업
 * 이름이 클래스 이름과 동일해야한다.
 * 리턴값이 없다(void 안붙임)
 * 모든 클래스는 반드시 생성자를 가져야한다.
 * 생성자가 하나도 없을 때만, 컴파일러가 자동추가한다. 
 * 
 * 오버로딩
 * 같은이름의 메서드 여러개 정의 
 */
class Data1{
	//생성자 없음 -> 컴파일러가 생성자 없을시 자동으로 생성자 생성함
	//따라서, 메인에서 기본 생성자 호출시 컴파일 에러 나지 않음 
	int value;
}
class Data22{
	int value;
	
	Data22() {}
	//생성자 1개 있음 -> 기본 생성자 호출해야한다.
	Data22(int x){
		value =x;
	}

}
public class OopStudy5 {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data22 d2 = new Data22(); //기본생성자가 없으면 에러가 발생한다.

	}
}
