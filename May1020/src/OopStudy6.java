class Bakery{
	String bread;
	String shape;
	int price;
	
	Bakery() {}
	
	Bakery(String b, String s, int p){
		bread =b; shape =s; price =p;
		
	}
}
public class OopStudy6 {
	public static void main(String[] args) {

		Bakery bk = new Bakery();
		bk.bread = "muffin"; bk.shape="circle"; bk.price=(1500);
		System.out.println("빵이름:" + bk.bread + ", 모양:"+ bk.shape+", 가격:" + bk.price);
		
		Bakery bk2 = new Bakery("madeleine","square",700);
		System.out.println("빵이름:" + bk2.bread + ", 모양:"+ bk2.shape+", 가격:" + bk2.price);

		
 	}
}
