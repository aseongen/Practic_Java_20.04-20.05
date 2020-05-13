//선생님 답변
//상속관계 오버라이딩
class Super02 {
	
	public int getNumber(int a) {
		return a+1;
	}
}// class Super

class CastingEx04 extends Super02 {

	@Override
	public int getNumber(int a) {
		return super.getNumber(a);
	}

} // CastinEx03 class

public class Ex17_2_Teacher {

	public static void main(String[] args) {

		Super02 a = new CastingEx04(); // 업캐스팅
		a.getNumber(1);// Super

	}
}
