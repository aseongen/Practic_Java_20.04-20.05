package Final;
/* 오버로딩 vs 오버라이딩
 * 오버로딩)
 * : 매개변수 기준 - 개수, 타입, 순서 다르게 
 * 
 * 오버라이딩)
 * :상속 필수 , 재정의 x 
 */
class GrandParents {
	int a = 10;
	int b = 20;

	public GrandParents() {
		System.out.println("GrandParents 생성자 호출 ");
	}

	public void p() {
		System.out.println("GrandParnets 메서드");
	}
} // GrandParents

class Children extends GrandParents {
	int c = 30;

	public Children(int a, int b, int c) {
		this.c = c;
	}

	@Override
	public void p() {
		super.p();
		System.out.println("오버라이딩 된 메서드");
		System.out.println();//개행
		System.out.println("a,b,c : " + a + b + c);
	}
} // Children

public class Review10 {
	public static void main(String[] args) {

		Children ch = new Children(100,200,300);
		ch.p();
	}
}
