/* 피피티 3번 문제
 * 업캐스팅 이후 오버라이딩해서  2의 값이 나온다.
 * 필요한 코드들 정립해주고, 메인 메서드가 어떻게 진행되었는지 주석문을 달아라.
 * 좀 더 좋은 방법으로 만들어올것 */

class Super2 {
	int a1;

	public void getNumber(int a1) {
		System.out.println(a1 + 1);

	}
}// class Super

class CastingEx05 extends Super2 {
	int a2;

	public void getNumber2(int a2) {
		System.out.println(a2 + 2);
	}

} // CastinEx03 class

public class Ex17_2 {

	public static void main(String[] args) {

		Super2 a = new CastingEx05(); // 업캐스팅
		a.getNumber(1);// Super

		// 다운캐스팅 여부
		if (a instanceof CastingEx05) {
			CastingEx05 ca = (CastingEx05) a; // 다운캐스팅
			ca.getNumber2(0); //CastingEx03

		}
	}
}
