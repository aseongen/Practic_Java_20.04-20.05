//애플리케이션 통합시험
class Mt02 {
	void pr(int a) {
		System.out.println(a);
	}

	void pr(int...arr) {
		for (int a: arr) {
			System.out.print(a+ " ");
		}
		System.out.println(); //개행
	}
}

public class Ex2_02 {
	public static void main(String[] args) {
		Mt02 m = new Mt02();
		m.pr(10);
		m.pr(10, 20);
	}
}