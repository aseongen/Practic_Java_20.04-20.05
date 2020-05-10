//Hiding Information: setter, getter 

class Room{
	//은닉된 멤버변수 --> 현재 블록 안에서만 접근가능 
	String product;
	private int price;
	
	//은닉된 멤버 변수에 값을 넣는 방법 --> 메소드를 사용
	public void setPrice(int new_Price) {
		price = new_Price;
	}
	//은닉된 멤버변수의 값을 읽는 방법 
	public int getPrice() {
		return price;
	}
}
public class OopStudy3 {
public static void main(String[] args) {
	//set 으로 저장하고, get 로 호출한다. 
	Room my = new Room();
	my.product = "침대"; my.setPrice(300000);
	System.out.println("물건 품목: "+ my.product + ", 가격: "+my.getPrice());
}
}
