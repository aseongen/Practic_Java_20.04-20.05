
class Product{
	String name;
	int price;
	
	Product(){}
	
	Product(String name, int price){
		this.name = name; this.price=price;
	}
	
	Product(String name){
		//this(name,800) -> 이렇게도 가능 
		this.name=name; this.price=800;
	}
	
	Product(int price){
		//this(물,price) -> 이렇게도 가능 
		this.name="물"; this.price=price;
		
	}
	//외부에서 조작 불가 
	void print() {
		System.out.println(name + "," +price);
	}
}


public class Ex13_02 {
	public static void main(String[] args) {

		Product p1 = new Product("웰치스", 700);
		p1.print();
		Product p2 = new Product("커피");
		p2.print();
		Product p3 = new Product(500);
		p3.print();
		Product p4 = new Product();
		
		System.out.println("------------------------------------");
		System.out.println(p1.name + "," + p1.price);
		System.out.println(p2.name + "," + p2.price);
		System.out.println(p3.name + "," + p3.price);
		
		
	}
}

/*멤버변수
 * 1.정적변수 :해당 클래스 접근 됨 , 값 공유 필요시만 사용 
 * 2. 인스턴스 변수 :해당클래스 접근 안됨
 */
 
