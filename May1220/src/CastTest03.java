public class CastTest03 {
	public static void main(String[] args) {

		Father01 f = new Child01() ; // 사전에 업캐스팅
		Child01 ch ;
		ch = (Child01)f; //다운 캐스팅
		
		ch.f01(); //상속받아서 호출
		ch.ch01(); // 자손 클래스 메서드 호출 
		
		Child01 ch2 = (Child01)f; //명시적인 다운캐싕
		ch2.f01();
		ch2.ch01();
/* 부모- 자식 클래스 사이에서 업캐스팅이 없을 경우
 * 중간에 있는 부모 클래스가 아닌 오브젝트 조상으로 상속이 된다.
 * 
 */
	}
}
