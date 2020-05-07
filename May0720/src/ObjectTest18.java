
class MyDate17 {
	int year;
	int month;
	int day; // 0기본값 저장됨

	MyDate17() {
		this(2020, 5, 14); // constructor ->마우스오버
		// 같은 클래스 내의 다른 생성자 호출

	}

	MyDate17(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day; // 생성자의 주된 기능인 멤버변수 직접 초기화
	}// 7라인-> 생성자 오버로딩

	void print() {
		System.out.println(year + " / " + month + " / " + day);

	}

}

public class ObjectTest18 {
	public static void main(String[] args) {
 
		 MyDate17 m = new MyDate17();
		 m.print();

	}
}
