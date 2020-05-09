class Product55{
	static int count =0;
	int serialNo;
	{ //인스턴스 초기화 블록
		++count;
		serialNo = count;
		
	}
	public Product55() {} //기본 생성자
}
public class ConsTest16 {
	public static void main(String[] args) {

		Product55 p1 = new Product55(); //객체 생성 될때 마다 인스턴스 초기화 블록 {} 실행
		Product55 p2 = new Product55();
		Product55 p3 = new Product55();
		
		System.out.println("p1제품번호: " + p1.serialNo);
		System.out.println("p2제품번호: " + p2.serialNo);
		System.out.println("p3제품번호: " + p3.serialNo);
		
		System.out.println("생산된 제품 수: " + Product55.count + "개 입니다. ");
	}
}
